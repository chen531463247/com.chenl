package com.example.demo1.service;

import com.example.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Object Sel(int id) {
        return userMapper.Sel(id);
    }
}
