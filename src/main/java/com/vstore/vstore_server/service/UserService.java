package com.vstore.vstore_server.service;

import com.vstore.vstore_server.bean.User;
import com.vstore.vstore_server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User login(String userName,String password){
        User user = userMapper.getUser(userName);
        return user;

    }
}
