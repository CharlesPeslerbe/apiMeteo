package tp3.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tp3.example.demo.model.AddressRepository;


@Controller
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/address")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "address";
    }
}