package com.vstore.vstore_server.bean;


import com.alibaba.fastjson.JSONArray;
import com.vstore.vstore_server.util.JsonUtil;

import java.util.List;

public class Role {
    private String id;
    private  String name;
    private String menusJson;
    private List<String> menus;

    public String getMenusJson() {
        return menusJson;
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
