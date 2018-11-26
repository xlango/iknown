package com.xhy.iknown.mapper;

import com.xhy.iknown.entity.Hobby;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HobbyMapper {

    List<Hobby> findAll();
    void add(Hobby hobby);

    void update(Hobby hobby);

    void delete(Hobby hobby);
}
