package com.xhy.iknown.controller;

import com.xhy.iknown.entity.Question;
import com.xhy.iknown.entity.Result;
import com.xhy.iknown.service.impl.QuestionServiceImpl;
import com.xhy.iknown.utils.ResultUtil;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {

    DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

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

    @RequestMapping("/add")
    public int add(Question question){
        Date date=new Date();
        String time= simpleDateFormat.format(date);
        question.setCreateTime(time);
        int id= questionService.add(question);
        Question q=questionService.findbyif(question);
        return q.getId();
    }

    @GetMapping("/getByPay")
    public List<Question> getByPay(Question question){
        return questionService.findByIspay(true);
    }

    @PostMapping("/getsByType")
    public List<Question> getsByType(Question question){
        List<Question> list=questionService.findsByIf(question);
        return list;
    }

    @PostMapping("/getsByUser")
    public List<Question> getsByUser(Question question){
        List<Question> list=questionService.findsByIf(question);
        question.setIspay(true);
        List<Question> list1=questionService.findsByIf(question);
        list1.addAll(list);
        return list1;
    }
}
