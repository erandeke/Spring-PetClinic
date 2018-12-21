package tech.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.springframework.services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/vets", "vets.html"})
    public String ListOfVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/vets";
    }
}
