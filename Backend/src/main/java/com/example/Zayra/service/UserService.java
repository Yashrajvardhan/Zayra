package com.example.Zayra.service;

import com.example.Zayra.model.User;
import com.example.Zayra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);

    }
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
}
