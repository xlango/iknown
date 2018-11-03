package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.User;
import com.xhy.iknown.mapper.UserMapper;
import com.xhy.iknown.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findbyif(User user) {
        return userMapper.findbyif(user);
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }
}
