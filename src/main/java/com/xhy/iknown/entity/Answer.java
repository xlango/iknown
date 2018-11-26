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
@Entity(name="answer")
public class Answer {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;//回答id
    private String content;//回答内容
    private int userid;//用户Id
    private int questionid ;//问题Id
    private int downloadmun;//下载数量
    private int zantongnum ;//赞同数量
    private int buzantonnum;//不赞同数量
    private Date createTime;


}
