package com.xhy.iknown.controller;

import java.util.List;

import com.xhy.iknown.entity.Result;
import com.xhy.iknown.entity.User;
import com.xhy.iknown.service.UserService;
import com.xhy.iknown.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(User user){
        userService.add(user);
        if (user!= null){

            return ResultUtil.success("success");
        }else {
            return ResultUtil.error("adds error");
        }

    }
    @PostMapping("/dologin")
    public Result login(User user) {
        User user1 = userService.findbyif(user);
        int roleId = user1.getRoleid();
        System.out.print(roleId);
        if (user1 != null && roleId == 1) {
            if (user1.getPassword().equals(user.getPassword())) {
                return ResultUtil.success(user1);
            } else {
                return ResultUtil.error("password error");
            }
        }
        if (user1 != null && roleId == 2) {
            if (user1.getPassword().equals(user.getPassword())) {
                return ResultUtil.success(user1);
            } else {
                return ResultUtil.error("password error");
            }
        } else {
            return ResultUtil.error("no user");
        }

    }


}
