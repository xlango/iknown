package com.xhy.iknown.controller;

import com.xhy.iknown.entity.User;
import com.xhy.iknown.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserContoller {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }
}
