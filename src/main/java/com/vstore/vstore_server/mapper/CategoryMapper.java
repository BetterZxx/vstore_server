package com.vstore.vstore_server.mapper;

import com.vstore.vstore_server.bean.Category;

import java.util.List;

public interface CategoryMapper {

    public List<Category> getCateList(String parentId);

    public int addCate(Category category);

    public int updateCateByName(Category category);

    public Category getCateById(String categoryId);
}
