package com.vstore.vstore_server.mapper;

import com.vstore.vstore_server.bean.Category;

import java.util.List;

public interface CategoryMapper {
 /*   public User getUserByName(String username);

    public List<User> getUserList();

    public int addUser(User user);

    public int updateUser(User user);

    public User getUserById(String id);

    public int deleteUserById(String id);*/
    public List<Category> getCateList(String parentId);

    public int addCate(Category category);

    public int updateCateByName(Category category);
}
