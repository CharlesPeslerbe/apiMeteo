package tp3.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/addressform")
        public String showform(){
        return "addressform";
    }

}
