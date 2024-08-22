package com.derya0.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    @GetMapping("/signUp")
    public String signUp(){
        return "Sign Up Page";
    }

}
