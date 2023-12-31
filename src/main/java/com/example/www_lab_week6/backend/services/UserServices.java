package com.example.www_lab_week6.backend.services;

import com.example.www_lab_week6.backend.models.User;
import com.example.www_lab_week6.backend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserServices {
    private UserRepository userRepository;

    public User login(String email, String password) {
        return userRepository.findByEmailAndPasswordHash(email, password).orElse(null);
    }
}
