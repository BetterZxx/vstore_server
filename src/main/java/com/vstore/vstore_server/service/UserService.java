package com.vstore.vstore_server.service;

import com.vstore.vstore_server.bean.User;
import com.vstore.vstore_server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int login(String username, String password) {
        User user = userMapper.getUserByName(username);
        if (user == null) {
            return 0;
        } else {
            if (user.getPassword().equals(password)) {
                return 1;
            }
            return 0;

        }
    }

    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public int addUser(User user) {
        user.setId(String.valueOf(System.currentTimeMillis()));
        user.setCreate_time(String.valueOf(System.currentTimeMillis()));
        return userMapper.addUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    public int deleteUserById(String id) {
        return userMapper.deleteUserById(id);
    }
}
