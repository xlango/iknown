package com.xhy.iknown.mapper;


import com.xhy.iknown.entity.Answer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AnswerMapper {

    List<Answer> findAll();
    void add(Answer answer);

    void update(Answer answer);

    void delete(Answer answer);

    List<Answer> getByQuestionId(Answer answer);

    int countAnswerByQuestionid(Answer answer);

    Answer getByZantongTop(Answer answer);

    Answer findbyif(Answer answer);
    List<Answer> findsbyif(Answer answer);
}
