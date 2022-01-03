package com.ytc.dec29.controller;

import java.util.List;

import com.ytc.dec29.service.UserService;
import com.ytc.dec29.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/login")
    public int login(String name, String password) {
        System.out.println("login()");
        if (!userService.exists(name)) {
            return 1;
        } else if (!userService.checkPassword(name, password)) {
            return 2;
        } else {
            return 3;
        }
    }
}
