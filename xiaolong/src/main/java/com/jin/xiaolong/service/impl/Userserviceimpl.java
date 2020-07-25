package com.jin.xiaolong.service.impl;

import com.jin.xiaolong.mapper.UserMapper;
import com.jin.xiaolong.pojo.User;
import com.jin.xiaolong.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userserviceimpl implements Userservice {
    @Autowired
    UserMapper usermapper;

    @Override
    public void addUser(User user) {
        usermapper.addUser(user);
    }

}
