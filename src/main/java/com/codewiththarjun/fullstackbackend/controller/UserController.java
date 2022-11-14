package com.codewiththarjun.fullstackbackend.controller;

import com.codewiththarjun.fullstackbackend.models.User;
import com.codewiththarjun.fullstackbackend.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserRepository userRepository ;
    @PostMapping("/user")
    User newUser (@RequestBody  User newUser){
        return userRepository.save(newUser);
    }
}
