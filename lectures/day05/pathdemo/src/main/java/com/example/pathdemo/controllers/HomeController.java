package com.example.pathdemo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/test/{id}")
    public String test(@PathVariable("id") String id){
        if(Integer.parseInt(id) % 2 == 0){
            return "Tyler is cool";
        } else {
            return String.format("The answer: %s", id);
        }
    }
    
}
