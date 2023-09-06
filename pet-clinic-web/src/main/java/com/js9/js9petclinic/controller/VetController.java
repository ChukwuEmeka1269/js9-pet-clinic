package com.js9.js9petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"","/vets","vets/index", "vets/index.html"})
    public String listAllVets(Model model){

        model.addAttribute("vet", "Laurel Kimberly");

        return "vets/index";
    }
}
