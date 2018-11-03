package com.xhy.iknown.service;

import com.xhy.iknown.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findbyif(User user);

    void add(User user);

    void update(User user);

    void delete(User user);
}


