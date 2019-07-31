package com.qianfeng.demo.config;

import com.qianfeng.demo.filter.MyFilter;
import com.qianfeng.demo.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZengJiFA
 * @Date 2019/7/29
 */
// web.xml 的配置
@Configuration
public class WebConfig {

    @Autowired
    private MyFilter myFilter;

    @Autowired
    private MyListener myListener;
    @Bean
    public FilterRegistrationBean init(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setName("myFilter");
        //如果是new出来的filter将不是由spring管理的
        registrationBean.setFilter(myFilter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean initRegistrationBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(myListener);
        return bean;

    }




}
