package com.survey.survey.auth.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("/login")
    public String login(){
        return "Login from public endpoint";
    }

    @PostMapping(value = "register")
    public String register(){
        return "Register from public endpoint";
    }
}
