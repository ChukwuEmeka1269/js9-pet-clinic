package com.js9.js9petclinic.controller;

import com.js9.js9petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listAllOwner(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
