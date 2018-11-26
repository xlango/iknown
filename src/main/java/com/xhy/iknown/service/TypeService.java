package com.xhy.iknown.service;

import com.github.pagehelper.PageInfo;
import com.xhy.iknown.entity.Type;

import java.util.List;

public interface TypeService {
    List<Type> findAll();
    void add(Type type);

    void update(Type type);

    void delete(Type type);
    Type getTypeById(Type type);
    Type gettypebyname(Type type);
     PageInfo<Type> findItemByPage(int currentPage, int pageSize);
}
