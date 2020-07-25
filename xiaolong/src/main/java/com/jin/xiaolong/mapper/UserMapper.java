package com.jin.xiaolong.mapper;

import com.jin.xiaolong.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    void addUser(User user);


}
