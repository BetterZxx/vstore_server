package com.vstore.vstore_server.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.vstore.vstore_server.bean.Role;
import com.vstore.vstore_server.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manage/role")
public class RoleController {
    @Autowired
    RoleService roleService;
    @RequestMapping(path="/add",method = RequestMethod.POST)
    public Map<String,Object> add(@RequestBody JSONObject jsonObject){
        Map maps = new HashMap<>();
        String roleName =jsonObject.get("roleName").toString();
        //time为1970到现在的毫秒数，同时作为唯一id
        String time = String.valueOf(System.currentTimeMillis());
        int isUpdate = roleService.addRloe(roleName,time,time);
        Role role = new Role();
        if(isUpdate==1){
            role.setId(time);
            role.setName(roleName);
            role.setCreate_time(time);
        }else{
            maps.put("status",1);
            maps.put("msg","添加出错了");
        }
        maps.put("status",0);
        maps.put("data",role);
        return maps;
    }
    @RequestMapping(path="/list",method = RequestMethod.GET)
    public Map<String,Object> getRoleList(){
        Map maps = new HashMap<>();
        List roleList = roleService.getRoleList();
        maps.put("status",0);
        maps.put("data",roleList);
        return maps;

    }
    @RequestMapping(path="/update",method = RequestMethod.POST)
    /**
     * Map接受的post参数,数字组成的字符串转化为数值形式，
     * json对象转为ArrayList对象，
     * 需将其转成字符串形式才能存入数据库
     */
    public Map<String,Object> updateRole(@RequestBody Map<String,Object> reqData){
        Map maps = new HashMap<>();
        Role role = new Role();
        role.setMenusJson(JSON.toJSONString(reqData.get("menus")));
        role.setAuth_name((String)reqData.get("auth_name"));
        role.setAuth_time(String.valueOf(reqData.get("auth_time")));
        role.setId(String.valueOf(reqData.get("id")));
        int isUpdate = roleService.updateRole(role);

        maps.put("status",0);
        maps.put("data",role);
        return maps;
    }

}
