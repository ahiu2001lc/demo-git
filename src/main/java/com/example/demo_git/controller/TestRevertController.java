package com.example.demo_git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class TestRevertController {

    @GetMapping("/hello")
    public String hi(){
        return "Welcome!";
    }
}
