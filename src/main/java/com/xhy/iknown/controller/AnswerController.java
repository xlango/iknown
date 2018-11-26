package com.xhy.iknown.controller;

import com.xhy.iknown.entity.Answer;

import com.xhy.iknown.entity.Comment;
import com.xhy.iknown.entity.Result;
import com.xhy.iknown.service.impl.AnswerServiceImpl;
import com.xhy.iknown.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/anwser")
@CrossOrigin
public class AnswerController {

    @Autowired
    private AnswerServiceImpl answerService;

    @RequestMapping(value = "/getByQuestionId",method = RequestMethod.GET)
    public List<Answer> getByQuestionId(Answer answer){
        List<Answer> answerList = answerService.getByQuestionId(answer);
        return answerList;
    }

    @RequestMapping(value = "/countAnswerByQuestionid",method = RequestMethod.GET)
    public int count(Answer answer){
        Integer num = answerService.countAnswerByQuestionid(answer);
        return num;
    }

    @RequestMapping(value = "/getByZantongTop",method = RequestMethod.GET)
    public Answer getByZantongTop(Answer answer){
        Answer num = answerService.getByZantongTop(answer);
        return num;
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Answer getById(Answer answer){
        Answer num = answerService.findbyif(answer);
        return num;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(Answer answer){
        answer.setCreateTime(new Date());
        answerService.add(answer);
        return ResultUtil.success();
    }
}
