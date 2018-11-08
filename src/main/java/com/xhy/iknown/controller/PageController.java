package com.xhy.iknown.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView index = new ModelAndView("front/index");
        return index;
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView login = new ModelAndView("front/login");
        return login;
    }
}
