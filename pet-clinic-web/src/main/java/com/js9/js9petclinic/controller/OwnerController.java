package com.js9.js9petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listAllOwner(){

        return "owners/index";
    }
}
