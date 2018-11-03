package com.xhy.iknown.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping("/")
public class PageController {

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView index = new ModelAndView("front/index");
        return index;
    }
}
