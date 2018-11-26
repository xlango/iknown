package com.xhy.iknown.controller;
import com.xhy.iknown.entity.Article;
import com.xhy.iknown.entity.Comment;
import com.xhy.iknown.service.CommentService;
import com.xhy.iknown.service.impl.ArticleServiceImpl;
import com.xhy.iknown.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
}
