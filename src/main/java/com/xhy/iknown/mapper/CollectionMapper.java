package com.xhy.iknown.mapper;

import com.xhy.iknown.entity.Collection;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CollectionMapper {

    List<Collection> findAll();
    void add(Collection collection);

    void update(Collection collection);

    void delete(Collection collection);
}
