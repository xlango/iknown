package com.xhy.iknown.service.impl;

import com.xhy.iknown.entity.Comment;
import com.xhy.iknown.mapper.CommentMapper;
import com.xhy.iknown.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> findAll() {  return commentMapper.findAll(); }

    @Override
    public List<Comment> getCommentByAId(int articleid) {   return commentMapper.getCommentByAId(articleid); }

    @Override
    public int countCommentOfarticle(Comment comment) { return commentMapper.countCommentOfarticle(comment); }

    @Override
    public void add(Comment comment) {commentMapper.add(comment);}

    @Override
    public void update(Comment comment) {commentMapper.update(comment);}

    @Override
    public void delete(Comment comment) {commentMapper.delete(comment); }

    @Override
    public List<Comment> findbyif(Comment comment) {
        return commentMapper.findbyif(comment);
    }
}
