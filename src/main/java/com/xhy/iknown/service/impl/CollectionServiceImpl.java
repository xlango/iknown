package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Collection;
import com.xhy.iknown.mapper.CollectionMapper;
import com.xhy.iknown.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    CollectionMapper collectionMapper;
    @Override
    public List<Collection> findAll() { return collectionMapper.findAll();}

    @Override
    public void add(Collection collection) {collectionMapper.add(collection);}

    @Override
    public void update(Collection collection) {collectionMapper.update(collection);}

    @Override
    public void delete(Collection collection) {collectionMapper.delete(collection); }
}
