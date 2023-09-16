package com.example.springproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping
    public String getName() {
        return "<h1>Holi: Soy Daniel Uwu</h1>";
    }
}
