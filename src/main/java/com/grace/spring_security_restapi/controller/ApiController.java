package com.grace.spring_security_restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/admin/hello")
    public String adminHello() {
        return "Hello, Admin!";
    }

    @GetMapping("/user/hello")
    public String userHello() {
        return "Hello, User!";
    }
}

