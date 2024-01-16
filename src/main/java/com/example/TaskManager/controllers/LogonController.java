package com.example.TaskManager.controllers;

import com.example.TaskManager.submodels.NonRegisterUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
public class LogonController {
    @GetMapping("/logon")
    public String logon() {
        return "logon";
    }

    @PostMapping("/logon")
    public String redirectToBoard(NonRegisterUser nonRegisterUser) {
        if (nonRegisterUser.getFirstPassword().equals(nonRegisterUser.getSecondPassword())) { // check on regex expression
            // send data to database
            return "board";
        } else {
            return "logon";
        }
    }
}