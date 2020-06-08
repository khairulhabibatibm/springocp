package com.ibm.demo.springocp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

    @GetMapping("/test")
    public String sayHello(){
        return "Halo this is Springboot";
    }
    
}