package tp3.example.demo.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import tp3.example.demo.model.Address;
import tp3.example.demo.model.MeteoReponse;

import java.util.Arrays;
import java.util.List;

@Controller
public class MeteoController {

    private String token = "&token=b1d9ea893b065dd3f27d63e17125eb8b1a49077bef2acb8ce6af75c431b01a3d";

    @PostMapping(value = "/meteo")
    public String getAddress(@RequestParam String address, Model model) throws JsonProcessingException {
        model.addAttribute("address", address);

        RestTemplate restTemplate = new RestTemplate();
        String urlApiGeo = "https://api-adresse.data.gouv.fr/search/?q=" + address;

        ResponseEntity<String> response = restTemplate.getForEntity(urlApiGeo, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response.getBody());
        JsonNode firstFeature = jsonNode.path("features").path(0);
        // Récupérer les coordonnées
        double longitude = firstFeature.path("geometry").path("coordinates").get(0).asDouble();
        model.addAttribute("longitude", longitude);
        double latitude = firstFeature.path("geometry").path("coordinates").get(1).asDouble();
        model.addAttribute("latitude", latitude);
        String citycode = firstFeature.path("properties").path("citycode").asText();
        model.addAttribute("citycode", citycode);
        String urlApiMeteo = "https://api.meteo-concept.com/api/forecast/daily?latlng=" + latitude + "%2C" + longitude + "&insee=" + citycode + token;
        ResponseEntity<MeteoReponse.Prevision> responseMeteo = restTemplate.getForEntity(urlApiMeteo, MeteoReponse.Prevision.class);
        MeteoReponse.Prevision meteoReponse = responseMeteo.getBody();
        model.addAttribute("forecast", meteoReponse.getForecast());
        return "meteo";
    }

}