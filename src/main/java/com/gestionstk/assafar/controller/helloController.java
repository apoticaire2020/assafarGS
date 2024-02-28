package com.gestionstk.assafar.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class helloController {
    @RequestMapping("/salam")
    public String index() {
        return "salam controller";
    }
    
   
    
}
