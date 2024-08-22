package com.derya0.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {

    @GetMapping("/signIn")
    public String signIn(){
        return "Sign In Page";
    }
}
