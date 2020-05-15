package com.example.demo1.controller;

import com.example.demo1.entity.Result;
import com.example.demo1.entity.User;

import com.example.demo1.entity.User1;
import com.example.demo1.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController1 {
    @Autowired
    private UserService1 userService1;

    @PostMapping(value = "/regist")
    public Result regist(User1 user){
        return userService1.regist(user);
    }
    @PostMapping(value = "/login")
    public Result login(User1 user){
        return userService1.login(user);

    }
}
