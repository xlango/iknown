package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Question;
import com.xhy.iknown.mapper.QuestionMapper;
import com.xhy.iknown.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;
    @Override
    public List<Question> findAll() {return questionMapper.findAll(); }

    @Override
    public int add(Question qsuestion) { return  questionMapper.add(qsuestion);}

    @Override
    public void update(Question qsuestion) {questionMapper.update(qsuestion); }

    @Override
    public void delete(Question qsuestion) {questionMapper.delete(qsuestion); }

    @Override
    public Question findbyif(Question question) {
        return questionMapper.findbyif(question);
    }

    @Override
    public List<Question> findByIspay(boolean ispay) {
        return questionMapper.findByIspay(ispay);
    }

    @Override
    public List<Question> findsByIf(Question question) {
        return questionMapper.findsByIf(question);
    }

    @Override
    public List<Question> getTopTenByLiulanliang() {
        return questionMapper.getTopTenByLiulanliang();
    }
}
