package com.js9.js9petclinic.controller;

import com.js9.js9petclinic.service.VetService;
import com.js9.js9petclinic.util.VetIdComparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/vets","vets/index", "vets/index.html"})
    public String listAllVets(Model model){

        model.addAttribute("vets", vetService.findAll().stream().sorted(new VetIdComparator()));

        return "vets/index";
    }
}
