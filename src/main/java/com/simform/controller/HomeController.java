package com.simform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> getWelcomeMessage() {
        return new ResponseEntity<>("Welcome to Azure AD with Spring Boot integration project!", HttpStatus.OK);
    }
}
