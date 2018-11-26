package com.xhy.iknown.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhy.iknown.entity.Type;
import com.xhy.iknown.mapper.TypeMapper;
import com.xhy.iknown.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;
    @Override
    public List<Type> findAll() {  return typeMapper.findAll(); }

    @Override
    public void add(Type type) {typeMapper.add(type); }

    @Override
    public void update(Type type) {typeMapper.update(type); }

    @Override
    public void delete(Type type) {typeMapper.delete(type);}

    @Override
    public Type getTypeById(Type type) {
        return typeMapper.getTypeById(type);
    }

    @Override
    public Type gettypebyname(Type type) {return typeMapper.gettypebyname(type);}

    @Override
    public PageInfo<Type> findItemByPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Type> allType = typeMapper.findAll();
        PageInfo<Type> pageInfo = new PageInfo<>(allType);
        return pageInfo;

    }
}
