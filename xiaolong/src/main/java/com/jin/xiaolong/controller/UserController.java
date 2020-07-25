package com.jin.xiaolong.controller;

import com.jin.xiaolong.pojo.User;
import com.jin.xiaolong.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    Userservice userservice;

    @RequestMapping("/add")
    public void tianjia(){
        User user = new User();
        user.setUserName("力战");
        user.setPassWord("1234");
        userservice.addUser(user);
    }
    @RequestMapping("/getUser")
    public void getUser(){

        userservice.selectUser();
    }

}
