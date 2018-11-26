package com.xhy.iknown.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int  id;//评论id
  private String content;//评论内容
  private int userid;//用户id
  private  int  answerid  ;//回答id
    private int questionid;
  private Date createtime;//创建时间
    private int articleid;
    private int commentnum;//评论数量
}
