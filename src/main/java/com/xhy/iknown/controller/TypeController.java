package com.xhy.iknown.controller;


import com.github.pagehelper.PageInfo;
import com.xhy.iknown.entity.Result;
import com.xhy.iknown.entity.Type;

import com.xhy.iknown.service.TypeService;
import com.xhy.iknown.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/admin")
@CrossOrigin
public class TypeController {
  @Autowired
    TypeService typeService;

    @PostMapping("/addType")
    public Result addType(Type type){
        typeService.add(type);
        String name=type.getName();
        if (type!= null  && name!=null ){
            return ResultUtil.success("success");
        }else {
            return ResultUtil.error("adds error");
        }

    }
    @PostMapping("/getTypeById")
    public Result getTypeById(Type type){
       Type typeGetbyid=typeService.getTypeById(type);
        return ResultUtil.success(typeGetbyid);
    }
    @PostMapping("/updateType")
    public Result updateType(Type type){
        System.out.println(type.getId()+"======="+type.getName());
        typeService.update(type);
        if (type!= null){
            return ResultUtil.success("success");
        }else {
            return ResultUtil.error("adds error");
        }
    }
    @PostMapping("/deleteTypeByid")
    public Result deleteTypeByid(Type type){
        typeService.delete(type);
        if (type!= null){
            return ResultUtil.success("success");
        }else {
            return ResultUtil.error("adds error");
        }

    }
    @PostMapping("/gettypebyname")
    public Result gettypebyname(Type type){
        typeService.gettypebyname(type);
        if (type!= null){
            return ResultUtil.success("success");
        }else {
            return ResultUtil.error("adds error");
        }

    }
    @GetMapping(value="pagetype")
    public String typeList(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                              @RequestParam(value = "pageSize", defaultValue = "5") int pageSize, HttpServletRequest request){
        PageInfo<Type> pageInfo=  typeService.findItemByPage(currentPage, pageSize);
        request.setAttribute("pageInfo", pageInfo);
        return "pagetype";
    }


    @GetMapping("/all")
    public List<Type> findAll(){
        return typeService.findAll();
    }
}
