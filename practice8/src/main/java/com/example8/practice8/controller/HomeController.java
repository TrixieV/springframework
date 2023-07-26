package com.example8.practice8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"", "/", "/home"})
    public String displayHomepage() {
//        model.addAttribute("username", "John Doe");
        return "home.html";
    }
}
