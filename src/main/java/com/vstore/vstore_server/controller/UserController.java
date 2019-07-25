package com.vstore.vstore_server.controller;

import com.vstore.vstore_server.bean.Role;
import com.vstore.vstore_server.bean.User;
import com.vstore.vstore_server.mapper.RoleMapper;

import com.vstore.vstore_server.service.RoleService;
import com.vstore.vstore_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value={"/"})
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    RoleMapper roleMapper;
    @RequestMapping(path="/login",method = RequestMethod.POST)
    public Map<String,Object> Login(@RequestBody Map<String,String> reqData)
    {

        String username = reqData.get("username");
        String password = reqData.get("password");
        int isLogin = userService.login(username,password);
        Map<String,Object> maps = new HashMap<>();
        if(isLogin==0){
            maps.put("status",1);
            maps.put("msg","用户名不存在或密码错误");
            return maps;
        }
        User user = userService.getUserByName(username);
        Role role = roleService.getRole(user.getRole_id());
        Map<String,Object> data = new HashMap<>();
        data.put("user",user);
        data.put("role",role);
        maps.put("status",0);
        maps.put("data",data);
        return maps;

    }
    @RequestMapping(path = "/manage/user/list",method = RequestMethod.GET)
    public Map<String,Object> getUserList(){
        Map maps = new HashMap<>();
        Map data = new HashMap<>();
        List users = userService.getUserList();
        List roles = roleService.getRoleList();
        data.put("users",users);
        data.put("roles",roles);
        maps.put("status",0);
        maps.put("data",data);
        return maps;

    }
    @RequestMapping(path = "/manage/user/add",method = RequestMethod.POST)
    public Map<String,Object> addUser(@RequestBody User user){
        Map maps = new HashMap<>();

        int isAdd = userService.addUser(user);
        if(isAdd==1) {
            maps.put("status", 0);
            maps.put("data", user);
            maps.put("add", isAdd);
        }else{
            maps.put("status",1);
            maps.put("msg","添加出错");
        }
        return maps;

    }
    @RequestMapping(path = "/manage/user/update",method = RequestMethod.POST)
    public Map<String,Object> updateUser(@RequestBody User user){
        Map maps = new HashMap<>();

        int isUpdate = userService.updateUser(user);
        if(isUpdate==1){
            User retUser = userService.getUserById(user.getId());
            maps.put("status",0);
            maps.put("data",retUser);
            maps.put("add",isUpdate);
        }else{
            maps.put("status",1);
            maps.put("msg","用户修改错误");
        }

        return maps;

    }
    @RequestMapping(path = "/manage/user/delete",method = RequestMethod.POST)
    public Map<String,Object> deleteUser(@RequestBody Map<String,String> reqData){
        Map maps = new HashMap<>();
        int isDelete = userService.deleteUserById(reqData.get("userId"));
        if(isDelete==1){
            maps.put("status",0);
            return maps;
        }else{
            maps.put("status",1);
            maps.put("msg",isDelete);
            return maps;
        }


    }

}
