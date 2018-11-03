package com.xhy.iknown.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   //id
    private String username;  //用户名
    @JsonIgnore
    private String password;  //密码

    private String  email;  //邮箱
}
