package com.xhy.iknown.controller;

import com.xhy.iknown.entity.Article;
import com.xhy.iknown.entity.Interest;
import com.xhy.iknown.entity.Result;
import com.xhy.iknown.service.impl.InterestServiceImpl;
import com.xhy.iknown.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/interest")
@CrossOrigin
public class InterestController {

    @Autowired
    private InterestServiceImpl interestService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(Interest interest){
        interest.setCreateTime(new Date());
        interestService.add(interest);
        return ResultUtil.success();
    }

    @RequestMapping("/all")
    public List<Interest> all(){
        List<Interest> all = interestService.findAll();
        return all;
    }
}
