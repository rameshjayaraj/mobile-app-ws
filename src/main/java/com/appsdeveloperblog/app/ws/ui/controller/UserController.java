package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "Get User method was called...";
    }

    @PostMapping
    public String createUser(){

        return "Create user method was called...";
    }

    @PutMapping
    public String updateUser(){
        return "Update user method was called...";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Delete user method was called...";
    }
}
