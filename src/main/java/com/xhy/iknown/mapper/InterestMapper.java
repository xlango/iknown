package com.xhy.iknown.mapper;

import com.xhy.iknown.entity.Interest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface InterestMapper {

    List<Interest> findAll();
    void add(Interest interest);

    void update(Interest interest);

    void delete(Interest interest);

    Interest findbyif(Interest interest);
}
