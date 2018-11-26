package com.xhy.iknown.controller;

import com.github.pagehelper.PageInfo;
import com.xhy.iknown.entity.Type;
import com.xhy.iknown.entity.User;
import com.xhy.iknown.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
页面控制*/
@RestController  //@RestController=@Controller+@RequestBody
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView login = new ModelAndView("front/login");
        return login;
    }
    @RequestMapping("/articles")
    public ModelAndView articles(){
        ModelAndView articles = new ModelAndView("front/articles");
        return articles;
    }
    @RequestMapping("/book")
    public ModelAndView book(){
        ModelAndView book = new ModelAndView("front/book");
        return book;
    }
    @RequestMapping("/onebook")
    public ModelAndView onebook(){
        ModelAndView onebook = new ModelAndView("front/onebook");
        return onebook;
    }
    @RequestMapping("/tuijian1")
    public ModelAndView tuijian1(){
        ModelAndView tuijian1 = new ModelAndView("front/tuijian1");
        return tuijian1;
    }
    @RequestMapping("/edit")
    public ModelAndView edit(){
        ModelAndView edit = new ModelAndView("front/edit");
        return edit;
    }
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView list = new ModelAndView("front/list");
        return list;
    }@RequestMapping("/pay")
    public ModelAndView pay(){
        ModelAndView pay = new ModelAndView("front/pay");
        return pay;
    }
    @RequestMapping("/show")
    public ModelAndView show(){
        ModelAndView show = new ModelAndView("front/show");
        return show;
    }
    @RequestMapping("/usercenter")
    public ModelAndView usercenter(){
        ModelAndView usercenter = new ModelAndView("front/usercenter");
        return usercenter;
    }
    @RequestMapping("/errorpage")
    public ModelAndView errorpage(){
        ModelAndView errorpage = new ModelAndView("front/404");
        return errorpage;
    }
    @RequestMapping("/register")
    public ModelAndView register(){
        ModelAndView register = new ModelAndView("front/register");
        return register;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView index = new ModelAndView("front/index");
        return index;
    }

    @RequestMapping("/qandalist")
    public ModelAndView qandalist(int questionid){
        ModelAndView qandalist = new ModelAndView("front/qandalist");
        return qandalist;
    }

    @RequestMapping("/admin/login")
    public ModelAndView adminlogin(){
        ModelAndView adminlogin = new ModelAndView("front/admin/login");
        return adminlogin;
    }
    @Autowired
    TypeService typeService;
    @RequestMapping("/admin/typelist")
    public ModelAndView typeList(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                           @RequestParam(value = "pageSize", defaultValue = "5") int pageSize, HttpServletRequest request) {
        PageInfo<Type> pageInfo = typeService.findItemByPage(currentPage, pageSize);
        ModelAndView typelist = new ModelAndView("front/admin/table-font-list.html");
        typelist.addObject("pageInfo", pageInfo);
        return typelist;
    }
//    public ModelAndView typelist(){
//        List<Type> typeList=typeService.findAll();
//       // map.addAttribute("typeList",typeList);
//        ModelAndView typelist=new ModelAndView("front/admin/table-font-list.html");
//        typelist.addObject("typeList",typeList);
//        return typelist;
//    }

    @RequestMapping("/admin/index")
    public ModelAndView admimIndex(){
        ModelAndView admimIndex = new ModelAndView("front/admin/index");
        return admimIndex;
    }
    @RequestMapping("/admin/book")
    public ModelAndView adminBook(){
        ModelAndView adminBook = new ModelAndView("front/admin/table-images-list");
        return adminBook;
    }
    @RequestMapping("/admin/answer")
    public ModelAndView admimAnswer(){
        ModelAndView admimAnswer = new ModelAndView("front/admin/form-news");
        return admimAnswer;
    }
    @RequestMapping("/admin/article")
    public ModelAndView admimarticle(){
        ModelAndView admimarticle = new ModelAndView("front/admin/form-news-list");
        return admimarticle;
    }
    @RequestMapping("/admin/form")
    public ModelAndView admimform(){
        ModelAndView admimform = new ModelAndView("front/admin/form-amazeui");
        return admimform;
    }
    @RequestMapping("/admin/line")
    public ModelAndView adminline(){
        ModelAndView adminline = new ModelAndView("front/admin/form-line");
        return adminline;
    }


    @RequestMapping("/test")
    public User test(){
        User user = new User();
        user.setUsername("dgdfg");
        user.setPassword("1111111");
        return user;
    }
}
