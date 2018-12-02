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
@Entity(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String  content ;//问题内容
    private String createTime;//创建时间
    private boolean ispay;//是否为付费问题
    private int price;//价格
    private int zantongnum;//赞
    private int buzantongnum;//不攒

    private int userid ;//用户Id
   private int answerid  ;//回答ID
    private int commentid;//评论Id
    private int liulanliang;//浏览量
    private String type;

}
