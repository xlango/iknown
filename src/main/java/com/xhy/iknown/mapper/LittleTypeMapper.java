package com.xhy.iknown.mapper;
import com.xhy.iknown.entity.LittleType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface LittleTypeMapper {

    List<LittleType> findAll();
    void add(LittleType littleType);

    void update(LittleType littleType);

    void delete(LittleType littleType);
}
