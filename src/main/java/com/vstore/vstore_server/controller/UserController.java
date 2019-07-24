package com.vstore.vstore_server.controller;

import com.vstore.vstore_server.bean.Role;
import com.vstore.vstore_server.bean.User;
import com.vstore.vstore_server.mapper.RoleMapper;

import com.vstore.vstore_server.service.RoleService;
import com.vstore.vstore_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value={"/","/user"})
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    RoleMapper roleMapper;
    @RequestMapping("/login")
    public Map<String,Object> Login(@RequestParam(value = "username", defaultValue = "admin") String userName,
                                    @RequestParam(value = "password", defaultValue = "admin") String password)
    {
        System.out.println(userName+password);
        User user = userService.login(userName,password);
        Role role = roleService.getRole(user.getId());
        Map<String,Object> maps = new HashMap<>();
        if(user==null){
            maps.put("status",1);
            maps.put("msg","用户名不存在或密码错误");
            return maps;
        }
        Map<String,Object> data = new HashMap<>();
        data.put("user",user);
        data.put("role",role);
        maps.put("status",0);
        maps.put("data",data);
        return maps;

    }
    @RequestMapping("/role")
    public Object roleRes(){
        Role role = roleMapper.getRole("1");
        return role;


    }
}
