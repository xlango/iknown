package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Role;
import com.xhy.iknown.mapper.RoleMapper;
import com.xhy.iknown.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public List<Role> findAll() {  return roleMapper.findAll(); }

    @Override
    public void add(Role role) {roleMapper.add(role); }

    @Override
    public void update(Role role) {roleMapper.update(role); }

    @Override
    public void delete(Role role) {roleMapper.delete(role); }
}
