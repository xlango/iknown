package com.xhy.iknown.service;

import com.xhy.iknown.entity.Hobby;

import java.util.List;

public interface HobbyService {



    List<Hobby> findAll();
    void add(Hobby hobby);

    void update(Hobby hobby);

    void delete(Hobby hobby);
}
