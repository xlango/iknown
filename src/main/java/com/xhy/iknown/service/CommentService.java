package com.xhy.iknown.service;

import com.xhy.iknown.entity.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> findAll();
    List<Comment> getCommentByAId(int articleid);
    int countCommentOfarticle(Comment comment);
    void add(Comment comment);

    void update(Comment comment);

    void delete(Comment comment);

    List<Comment> findbyif(Comment comment);
}
