package com.xhy.iknown.service;

import com.xhy.iknown.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();
    void add(Question qsuestion);

    void update(Question qsuestion);

    void delete(Question qsuestion);

    List<Question> getTopTenByLiulanliang();

    Question findbyif(Question question);

}
