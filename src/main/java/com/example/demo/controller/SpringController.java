package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringController {

    @GetMapping("/greeting")
    public String greet(@RequestParam(name="name", required = false, defaultValue = "hello_world")String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }
}
