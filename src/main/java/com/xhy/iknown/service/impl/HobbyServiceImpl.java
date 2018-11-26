package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Hobby;
import com.xhy.iknown.mapper.HobbyMapper;
import com.xhy.iknown.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HobbyServiceImpl implements HobbyService {
    @Autowired
    HobbyMapper hobbyMapper;

    @Override
    public List<Hobby> findAll() { return hobbyMapper.findAll();}

    @Override
    public void add(Hobby hobby) {hobbyMapper.add(hobby); }

    @Override
    public void update(Hobby hobby) {hobbyMapper.update(hobby);}

    @Override
    public void delete(Hobby hobby) {hobbyMapper.delete(hobby); }
}
