package com.vstore.vstore_server.mapper;


import com.vstore.vstore_server.bean.User;

import java.util.List;

public interface UserMapper {
    public User getUserByName(String username);

    public List<User> getUserList();

    public int addUser(User user);

    public int updateUser(User user);

    public User getUserById(String id);

    public int deleteUserById(String id);


}
