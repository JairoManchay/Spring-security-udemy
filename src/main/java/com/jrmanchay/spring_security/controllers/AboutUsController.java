package com.jrmanchay.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/about-us")
public class AboutUsController {

    @GetMapping
    public Map<String, String> aboutUs() {
        return Collections.singletonMap("msj", "Welcome to About Us Service");
    }
}
