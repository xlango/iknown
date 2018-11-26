package com.xhy.iknown.controller;

import com.xhy.iknown.entity.Question;
import com.xhy.iknown.service.impl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;

    @RequestMapping("/all")
    public List<Question> all(){
        List<Question> all = questionService.findAll();
        return all;
    }

    @RequestMapping("/getTopTenByLiulanliang")
    public List<Question> getTopTenByLiulanliang(){
        List<Question> top = questionService.getTopTenByLiulanliang();
        return top;
    }

    @GetMapping("/getQuestionById")
    public Question getQuestionById(Question question){
        return questionService.findbyif(question);
    }

}
