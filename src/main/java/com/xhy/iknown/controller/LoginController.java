package com.xhy.iknown.controller;

import java.util.List;

import com.xhy.iknown.entity.Message;
import com.xhy.iknown.entity.Result;
import com.xhy.iknown.entity.User;
import com.xhy.iknown.service.UserService;
import com.xhy.iknown.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/dologin")
    public Result login(User user){
        User user1 = userService.findbyif(user);
        if (user1!=null){
            if (user1.getPassword().equals(user.getPassword())){
                return ResultUtil.success("success");
            }else {
                return ResultUtil.error("password error");
            }
        }else {
            return ResultUtil.error("no user");
        }

    }


}
