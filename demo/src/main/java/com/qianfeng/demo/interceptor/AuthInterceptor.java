package com.qianfeng.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ZengJiFA
 * @Date 2019/7/29
 */
//注解:将类交给spring管理
@Component
public class AuthInterceptor implements HandlerInterceptor {

   //jdk1.8之前 接口不能有实现
    //实现类实现接口 需要实现接口的所有方法  除非自己也是抽象的
    //但是通常这个实现类 我们希望不是一个抽象类 ,又不想所有的方法都实现(使用适配器的方式)

    //jdk1.8之后  直接实现即可 (接口可以有默认的实现)

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("拦截器前置拦截");
        return true;
    }
}
