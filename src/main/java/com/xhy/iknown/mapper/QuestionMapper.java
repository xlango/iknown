package com.xhy.iknown.mapper;

import com.xhy.iknown.entity.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface QuestionMapper {

    List<Question> findAll();
    void add(Question qsuestion);

    void update(Question qsuestion);

    void delete(Question qsuestion);

    List<Question> getTopTenByLiulanliang();

    Question findbyif(Question question);
}
