package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Answer;
import com.xhy.iknown.mapper.AnswerMapper;
import com.xhy.iknown.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerMapper answerMapper;
    @Override
    public List<Answer> findAll() { return answerMapper.findAll();}

    @Override
    public void add(Answer answer) { answerMapper.add(answer); }

    @Override
    public void update(Answer answer) { answerMapper.update(answer);  }

    @Override
    public void delete(Answer answer) { answerMapper.delete(answer);  }

    @Override
    public Answer getByZantongTop(Answer answer) {
        return answerMapper.getByZantongTop(answer);
    }

    @Override
    public Answer findbyif(Answer answer) {
        return answerMapper.findbyif(answer);
    }

    @Override
    public List<Answer> findsByIf(Answer answer) {
        return answerMapper.findsbyif(answer);
    }

    @Override
    public List<Answer> getByQuestionId(Answer answer) {
        return answerMapper.getByQuestionId(answer);
    }
    @Override
    public int countAnswerByQuestionid(Answer answer) {
        return answerMapper.countAnswerByQuestionid(answer);
    }
}
