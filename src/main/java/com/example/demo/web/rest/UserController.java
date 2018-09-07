package com.example.demo.web.rest;

import com.example.demo.vm.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @GetMapping("/")
    public String hello() {
        return "Hello Vikas!";
    }

    @PostMapping("/")
    public User createUser(@Valid @RequestBody User user) {
        return user;
    }
}
