package com.xhy.iknown.service;

import com.xhy.iknown.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    void add(Role role);

    void update(Role role);

    void delete(Role role);
}
