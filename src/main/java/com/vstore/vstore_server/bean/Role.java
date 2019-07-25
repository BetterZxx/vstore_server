package com.vstore.vstore_server.bean;


import com.alibaba.fastjson.JSONArray;
import com.vstore.vstore_server.util.JsonUtil;

import java.util.List;

public class Role {
    private String id;
    private  String name;
    private String menusJson;
    private String createTime;
    private String authTime;
    private String authName;
    private List<String> menus;

    public String getMenusJson() {
        return menusJson;
    }

    public String getCreate_time() {
        return createTime;
    }

    public void setCreate_time(String create_time) {
        this.createTime = create_time;
    }

    public String getAuth_time() {
        return authTime;
    }

    public void setAuth_time(String auth_time) {
        this.authTime = auth_time;
    }

    public String getAuth_name() {
        return authName;
    }

    public void setAuth_name(String auth_name) {
        this.authName = auth_name;
    }

    public void setMenusJson(String menusJson) {
        List list = JsonUtil.jsonToList(menusJson,String.class);
        this.setMenus(list);
        this.menusJson = menusJson;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMenus() {
        return menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }
}
