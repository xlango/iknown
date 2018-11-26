package com.xhy.iknown.mapper;

import com.xhy.iknown.entity.Role;
import com.xhy.iknown.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RoleMapper {

    List<Role> findAll();
    void add(Role role);

    void update(Role role);

    void delete(Role role);
}
