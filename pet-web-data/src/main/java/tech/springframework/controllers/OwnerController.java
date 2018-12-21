package tech.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OwnerController {

    @RequestMapping({"/owners"})
    private String displayListOfOwners()
    {
        return "owners/owners";
    }
}
