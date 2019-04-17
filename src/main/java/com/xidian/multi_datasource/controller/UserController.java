package com.xidian.multi_datasource.controller;


import com.xidian.multi_datasource.service01.UserService01;
import com.xidian.multi_datasource.service02.UserService02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService01 userService01;

    @Autowired
    private UserService02 userService02;

    @RequestMapping("/insert01")
    public int insert01(String name, Integer age){
        return  userService01.insert(name,age);
    }

    @RequestMapping("/insert02")
    public int insert02(String name, Integer age){
        return  userService02.insert(name,age);
    }
}
