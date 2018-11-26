package com.xhy.iknown.mapper;

import com.github.pagehelper.PageInfo;
import com.xhy.iknown.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TypeMapper {

    List<Type> findAll();
    void add(Type type);

    void update(Type type);
    void delete(Type type);
    Type getTypeById(Type type);
    Type gettypebyname(Type type);
    public PageInfo<Type> findItemByPage(int currentPage, int pageSize);
}
