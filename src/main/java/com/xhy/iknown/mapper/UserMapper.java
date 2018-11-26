package com.xhy.iknown.mapper;

import java.util.List;

import com.xhy.iknown.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface UserMapper {

    List<User> findAll();

    User findbyif(User user);

    void add(User user);

    void update(User user);

    void delete(User user);

     User login(String username,String password);
}