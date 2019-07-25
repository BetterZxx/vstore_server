package com.vstore.vstore_server.service;

import com.vstore.vstore_server.bean.Role;
import com.vstore.vstore_server.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public Role getRole(String id){
        Role role = roleMapper.getRole(id);
        return role;
    }
    public int addRloe(String roleName,String id,String time){
        int isUpdate = roleMapper.addRole(roleName,id,time);
        return isUpdate;
    }
    public List<Role> getRoleList(){
        return roleMapper.getRoleList();
    }
    public int updateRole(Role role){
        return roleMapper.updateRole(role);

    }
}
