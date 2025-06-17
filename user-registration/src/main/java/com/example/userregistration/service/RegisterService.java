package com.example.userregistration.service;

import com.example.userregistration.model.Register;
import com.example.userregistration.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    public Register saveUser(Register register)
    {
        return registerRepository.save(register);
    }
}
