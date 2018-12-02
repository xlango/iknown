package com.xhy.iknown.controller;
import com.xhy.iknown.entity.*;
import com.xhy.iknown.service.CommentService;
import com.xhy.iknown.service.impl.ArticleServiceImpl;
import com.xhy.iknown.service.impl.CommentServiceImpl;
import com.xhy.iknown.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {

    @Autowired
    private ArticleServiceImpl articleService;
    @Autowired
    private CommentServiceImpl commentService;

    @RequestMapping(value = "/getarticleList",method = RequestMethod.GET)
    public List<Article> articleList(){
        List<Article> articleList =articleService.findAll();

        return articleList;
    }
    @RequestMapping(value = "/countCommentOfarticle",method = RequestMethod.GET)
    public int count(Comment comment){
        Integer num = commentService.countCommentOfarticle(comment);
        return num;
    }
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public Article findById(Article article){
        Article num = articleService.findbyif(article);
        return num;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(Article article){
        article.setCreatetime(new Date());
        articleService.add(article);
        return ResultUtil.success();
    }

    @RequestMapping("/all")
    public List<Article> all(){
        List<Article> all = articleService.findAll();
        return all;
    }

    @PostMapping("/getsByUser")
    public List<Article> getsByUser(Article article){
        List<Article> list=articleService.findsByIf(article);
        return list;
    }
}
