package com.qianfeng.demo.controller;

import com.qianfeng.demo.entity.User;
import com.qianfeng.demo.resources.MyResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZengJiFA
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {


   /* @Value("${image.serverpath}")
    private String image;
*/
   @Autowired
   private MyResources myResources;

    @GetMapping("hello")
    public String hello(){
        return "hello,你好!大佬a!";
    }

  /*  @RequestMapping("images")
    public String images(){
        return image;
    }
*/

    @GetMapping("propertites")
    public String properties(){
        return "配置:"+myResources.getResources();
    }

    @GetMapping("page")
    public String page(@RequestParam(name = "index",required = false,defaultValue = "1") Integer pageIndex){
       return "pageIndex:"+pageIndex;

    }
    //带参数的
    @GetMapping("page/{pageIndex}")
    public String page2(@PathVariable("pageIndex") Integer pageIndex){
        return "pageIndex2:"+pageIndex;

    }

    @PostMapping("add")
    public User addUser(User user){
        //设置默认日期
       // user.setCreateDate(new Date());
        return user;
    }

}

