package com.example.userregistration.controller;

import com.example.userregistration.model.Register;
import com.example.userregistration.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("register") Register register, Model model) {
        Register savedUser = registerService.saveUser(register);
        
        model.addAttribute("register", savedUser);
        return "success";
    }
}
