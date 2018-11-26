package com.xhy.iknown.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity(name="littletype")
public class LittleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//小分类表格
    private String name;//小分类名字
    private int typeid;//大分类Id
}
