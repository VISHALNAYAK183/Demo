package com.example.userregistration.repository;

import com.example.userregistration.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {
    Register findByUsernameAndPassword(String username, String password);
}
