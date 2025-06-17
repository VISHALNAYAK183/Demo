package com.example.userregistration.controller;

import com.example.userregistration.model.Register;
import com.example.userregistration.repository.RegisterRepository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private RegisterRepository registerRepository;

    @PostMapping("/success")
    public String loginUser(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        Register user = registerRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            return "Login successful! Welcome, " + user.getUsername();
        } else {
            return "Invalid username or password.";
        }
    }
}