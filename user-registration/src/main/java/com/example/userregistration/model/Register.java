package com.example.userregistration.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Register")
@Getter
@Setter
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String regno;
    private String name;
    private String email;
    private String username;
    private String password;
}
