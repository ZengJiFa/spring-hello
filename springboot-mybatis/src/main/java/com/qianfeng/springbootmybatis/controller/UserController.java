package com.qianfeng.springbootmybatis.controller;

import com.qianfeng.springbootmybatis.entity.TUser;
import com.qianfeng.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ZengJiFA
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("getUser/{id}")
    public TUser getUser(@PathVariable("id") Long id){
       return userService.getById(id);
    }
    @RequestMapping("hello")
    public String hello(ModelMap map){
        int i=10/0;
        map.addAttribute("user","曾继发");
        //添加集合数据
        List<TUser> list = new ArrayList<>();
        list.add(new TUser(1L,"zjf","222"));
        list.add(new TUser(2L,"xu","333"));
        map.put("list",list);
        //存一个时间
        map.put("now",new Date());
        map.put("age",20);
        return "hello";
    }
    //后端效验
    @RequestMapping("getUser")
    public String getUser(@Valid TUser user){
        System.out.println("commit test");
        return "ok";
    }
}
