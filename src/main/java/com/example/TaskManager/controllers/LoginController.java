package com.example.TaskManager.controllers;

import com.example.TaskManager.models.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String redirectToBoard(User user) {
//        if () // check in BD
        // send data to database
        return "board";
    }
}
