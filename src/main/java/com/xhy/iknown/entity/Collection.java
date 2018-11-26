package com.xhy.iknown.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity(name = "collection")
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int  id;//收藏Id
   private String name;//收藏夹名字
   private int questionid;//问题Id
   private int userid;//用户Id
}
