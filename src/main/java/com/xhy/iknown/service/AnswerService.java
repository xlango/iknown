package com.xhy.iknown.service;

import com.xhy.iknown.entity.Answer;

import java.util.List;

public interface AnswerService {


    List<Answer> findAll();
    void add(Answer answer);

    void update(Answer answer);

    void delete(Answer answer);

    List<Answer> getByQuestionId(Answer answer);

    int countAnswerByQuestionid(Answer answer);

    Answer getByZantongTop(Answer answer);

    Answer findbyif(Answer answer);
}
