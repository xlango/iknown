package com.xhy.iknown.controller;

import java.util.List;
import com.xhy.iknown.entity.User;
import com.xhy.iknown.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/all")
    public List<User> add(){
        /*User user = new User();
        user.setUsername("222222");
        user.setPassword("222222");
        user.setEmail("222222@qq.com");
        userService.add(user);
        User user1 = new User();
        user1.setUsername("111111");*/
        return userService.findAll();
    }

}
