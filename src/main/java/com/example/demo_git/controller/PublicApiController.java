package com.example.demo_git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class PublicApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello from Alice & Bob!";
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from alice!";
    }
}
