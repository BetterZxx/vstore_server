package com.vstore.vstore_server.controller;

import com.vstore.vstore_server.bean.LoginRes;
import com.vstore.vstore_server.bean.User;
import com.vstore.vstore_server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/","/user"})
public class UserController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/login")
    public LoginRes Login(){
        User user = userMapper.getUser(1);
        LoginRes loginRes = new LoginRes();
        loginRes.setUser(user);
        loginRes.setStatus(0);
        return loginRes;

    }
}
