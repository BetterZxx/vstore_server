package com.vstore.vstore_server.mapper;

import com.vstore.vstore_server.bean.Role;

import java.util.List;

public interface RoleMapper {
    public Role getRole(String id);
    public int addRole(String roleName,String id,String time);
    public List<Role> getRoleList();
    public int updateRole(Role role);
}
