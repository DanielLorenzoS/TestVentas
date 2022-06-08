package com.clientes.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerView {
    
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
