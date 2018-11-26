package com.xhy.iknown.service;

import com.xhy.iknown.entity.LittleType;

import java.util.List;

public interface LittleTypeService {


    List<LittleType> findAll();
    void add(LittleType littleType);

    void update(LittleType littleType);

    void delete(LittleType littleType);
}
