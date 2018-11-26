package com.xhy.iknown.controller;

import com.xhy.iknown.entity.Answer;
import com.xhy.iknown.entity.Comment;
import com.xhy.iknown.entity.Result;
import com.xhy.iknown.service.impl.CommentServiceImpl;
import com.xhy.iknown.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentServiceImpl commentService;

    DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping(value = "/getCommentByQueIdAndAnsId",method = RequestMethod.GET)
    public List<Comment> getCommentByQueIdAndAnsId(Comment comment){
        List<Comment> commentList = commentService.findbyif(comment);
        return commentList;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(Comment comment){
        comment.setCreatetime(new Date());
         commentService.add(comment);
        return ResultUtil.success();
    }
}
