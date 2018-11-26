package com.xhy.iknown.entity;
/*用户个性化推荐用表格*/

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity(name="hobby")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//推荐id
    private int littetypeid;//小分类类型
    private int userid;//用户id
}
