package tech.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"","/vets","vets.html"})
    public String ListOfVets() {
        return "vets/vets";
    }
}
