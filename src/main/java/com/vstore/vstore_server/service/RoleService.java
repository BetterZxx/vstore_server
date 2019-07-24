package com.vstore.vstore_server.service;

import com.vstore.vstore_server.bean.Role;
import com.vstore.vstore_server.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public Role getRole(String id){
        Role role = roleMapper.getRole(id);
        return role;
    }
}
