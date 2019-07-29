package com.vstore.vstore_server.controller;

import com.alibaba.fastjson.JSONObject;
import com.vstore.vstore_server.bean.Category;
import com.vstore.vstore_server.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value={"/"})
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(path = "/manage/category/list",method = RequestMethod.GET)
    public Map<String,Object> getCateList(String parentId){

        //String parentId=reqData.get("parentId");
        //方式二：@RequestParam(name="parentId",required = false) String parentId
        List categorys=categoryService.getCateList(parentId);

        Map map=new HashMap<>();
        map.put("status",0);
        map.put("data",categorys);
        return map;
    }

    @RequestMapping(path = "/manage/category/add",method = RequestMethod.POST)
    public Map<String,Object> addCate(@RequestBody JSONObject jsonObject){
        String parentId =jsonObject.get("parentId").toString();
        String name =jsonObject.get("categoryName").toString();

        Map map=new HashMap<>();
        Category category=new Category();
        String time = String.valueOf(System.currentTimeMillis());
        category.setId(time);
        category.setName(name);
        category.setParentId(parentId);
        int flag=categoryService.addCate(category);
        if(flag==1){
            map.put("status",0);
            map.put("data",category);
        }else{
            map.put("status",1);
            map.put("msg","添加出错");
        }

        return map;
    }

    @RequestMapping(path = "/manage/category/update",method = RequestMethod.POST)
    public Map<String,Object> updateCate(@RequestBody Map<String,String> reqData){
        String categoryId=reqData.get("categoryId");
        String name=reqData.get("categoryName");
        Map map=new HashMap<>();
        Category category=new Category();
        category.setName(name);
        category.setId(categoryId);
        int flag=categoryService.updateCateByName(category);
        if(flag==1){
            map.put("status",0);

        }

        return map;
    }

    @RequestMapping(path = "/manage/category/info",method = RequestMethod.GET)
    public Map<String,Object> getCateById(String categoryId){
        Category category=categoryService.getCateById(categoryId);

        Map map=new HashMap<>();
        System.out.println(category);

            map.put("status",0);
            map.put("data",category);


        return map;
    }
}
