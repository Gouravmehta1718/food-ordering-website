package com.foodapp.food_ordering_backend.controller;

import com.foodapp.food_ordering_backend.model.User;
import com.foodapp.food_ordering_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserRepository userRepository;

    //Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Add new user

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
