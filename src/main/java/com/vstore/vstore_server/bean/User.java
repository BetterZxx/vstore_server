package com.vstore.vstore_server.bean;

public class User {
    private String id;
    private  String username;
    private  String password;
    private  String roleId;
    private  String phone;
    private  String email;
    private  String createTime;

    public String getCreate_time() {
        return createTime;
    }

    public void setCreate_time(String create_time) {
        this.createTime = create_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole_id() {
        return roleId;
    }

    public void setRole_id(String role_id) {
        this.roleId = role_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
