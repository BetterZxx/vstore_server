package com.vstore.vstore_server.service;

import com.vstore.vstore_server.bean.Category;
import com.vstore.vstore_server.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> getCateList(String parentId){
        return categoryMapper.getCateList(parentId);
    }

    public int addCate(Category category){
        return categoryMapper.addCate(category);
    }

    public int updateCateByName(Category category){
        return categoryMapper.updateCateByName(category);
    }

    public Category getCateById(String categoryId){
        return categoryMapper.getCateById(categoryId);
    }
}
