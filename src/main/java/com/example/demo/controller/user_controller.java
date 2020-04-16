package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class user_controller {

    @GetMapping("/users")
    public String getUser(){
        String user = "Thakshila";

        return user;
    }

    @GetMapping("/login/{user}/{password}")
    public String
    getLoging(@PathVariable("user")String user,
              @PathVariable("passwrd") String password) {
        String userName = "Thakshila";
        String passWord = "password";
        String message = "";

        if(userName == user && passWord == password){
            message ="Approved User";
        } else {
            message = "User Not Allowed";
        }

        return message;
    }
}
