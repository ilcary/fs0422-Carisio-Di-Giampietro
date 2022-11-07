package com.manuelsenatore.security.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ciao")
    public String test(){
        System.out.println("ciao");
        return "ciao";
    }
}
