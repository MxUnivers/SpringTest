package com.ensias.srpingbooinit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String bienvenueSpring(){
        return "Hello World";
    }
    @RequestMapping("/salut")
    public String bienvenue(){
        return "C'est parfait";
    }
}
