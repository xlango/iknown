package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.LittleType;
import com.xhy.iknown.mapper.LittleTypeMapper;
import com.xhy.iknown.service.LittleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LittleTypeServiceImpl implements LittleTypeService {
    @Autowired
    LittleTypeMapper littleTypeMapper;
    @Override
    public List<LittleType> findAll() {  return littleTypeMapper.findAll();}

    @Override
    public void add(LittleType littleType) {littleTypeMapper.add(littleType);}

    @Override
    public void update(LittleType littleType) {littleTypeMapper.update(littleType);}

    @Override
    public void delete(LittleType littleType) {littleTypeMapper.delete(littleType);}
}
