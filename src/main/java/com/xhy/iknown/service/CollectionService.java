package com.xhy.iknown.service;

import com.xhy.iknown.entity.Collection;

import java.util.List;

public interface CollectionService {

    List<Collection> findAll();
    void add(Collection collection);

    void update(Collection collection);

    void delete(Collection collection);

}
