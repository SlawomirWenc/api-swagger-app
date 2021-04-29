package com.example.apiswaggerapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invisible")
public class InvisibleForSwaggerApi {

    @GetMapping("/hello")
    public String invisibleMethod(@RequestParam String name){
        return "Hello " + name;
    }
}
