package com.hyunmyung.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${test.name}")
    private String name;

    @GetMapping("/config")
    public void configResolver(){
        System.out.println("name = " + name);

    }
}
