package tech.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.springframework.services.OwnerService;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners"})
    private String displayListOfOwners(Model model)
    {
        //This will bind the data from ui to backend
        //It will get all the owners out of map
        model.addAttribute("owners",ownerService.findAll());

        return "owners/owners";
    }
}
