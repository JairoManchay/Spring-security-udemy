package com.jrmanchay.spring_security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/cards")
public class CardsController {

    public Map<String, String> cards(){
        return Collections.singletonMap("msj", "Welcome to Cards Service");
    }
}
