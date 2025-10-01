package com.example.demo_git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestConflictController {

    @GetMapping("/v1/hello")
    public String helloV1(){
        return "version: Alice";
    }
}
