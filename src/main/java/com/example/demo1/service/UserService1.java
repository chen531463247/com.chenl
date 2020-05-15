package com.example.demo1.service;

import com.example.demo1.entity.Result;
import com.example.demo1.entity.User1;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.mapper.UserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserService1 {
    @Autowired
    private UserMapper1 userMapper1;

    public Result regist(User1 user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);

        User1 existUser = userMapper1.findUserByName(user.getUsername());
        if (existUser != null) {
            result.setMsg("用户名已经存在");
        } else {
            userMapper1.regist(user);
            result.setMsg("注册成功");
            result.setSuccess(true);
            result.setDetail(user);
        }
        return result;
    }

    public Result login(User1 user){
        Result result=new Result();
        result.setSuccess(false);
        result.setDetail(null);

        Long userId=userMapper1.login(user);
        if(userId==null){
            result.setMsg("用户名或者密码错误");
            System.out.println("用户名或者密码错误");
        }else{
            result.setMsg("登录成功");
            result.setSuccess(true);
            user.setId(userId);
            result.setDetail(user);
        }
        return result;
    }
    }

