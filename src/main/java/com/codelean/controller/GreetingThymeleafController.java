package com.codelean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingThymeleafController {

    @GetMapping("/greeting")
    public String listStudent(){
        return "greeting";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/viewdetail")
    public String viewdetail(){
        return "viewdetail";
    }

    @GetMapping("/update")
    public String update(){
        return "edit";
    }
}