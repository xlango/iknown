package com.xhy.iknown.entity;

import javafx.scene.text.Text;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name="article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//文章id
    private String title;//文章标题
    private String content;//文章内容
    private int userid;//用户Id
    private Date createtime;//创建时间
    private int commentid;//评论id
    private int liulanliang;//浏览量
 //   private List<Comment> comment;
}
