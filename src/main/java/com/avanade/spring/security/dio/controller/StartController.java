package com.avanade.spring.security.dio.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/status/ping")
    public String ping(){
        return "pong";
    }
}
