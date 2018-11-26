package com.xhy.iknown.mapper;

import com.xhy.iknown.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CommentMapper {

    List<Comment> findAll();
    List<Comment> getCommentByAId(int articleid);
    int countCommentOfarticle(Comment comment);
    void add(Comment comment);

    void update(Comment comment);

    void delete(Comment comment);

    List<Comment> findbyif(Comment comment);
}
