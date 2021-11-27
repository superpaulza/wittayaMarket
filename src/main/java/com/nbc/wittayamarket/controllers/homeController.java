package com.nbc.wittayamarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String index() {
        return "inter";
    }

    @GetMapping("/hello")
    public String getHello(Model model) {
        model.addAttribute("hello","Hello Spring Boot User");
        return "hello";
    }
}
