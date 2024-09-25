package com.example.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
   // @ResponseBody
    public String greet(){
        return "Welcome to Spring homepage";
    }

    @RequestMapping("/about")
    public String about(){
        return "<h1>This is about page</h1>";
    }
}
