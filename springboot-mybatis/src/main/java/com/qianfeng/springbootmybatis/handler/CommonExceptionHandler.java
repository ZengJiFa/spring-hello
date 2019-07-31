package com.qianfeng.springbootmybatis.handler;

import com.qianfeng.springbootmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZengJiFA
 * @Date 2019/7/30
 */
//全局异常处理类
@ControllerAdvice
public class CommonExceptionHandler {

    //将状态信息响应回页面

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e){
        e.printStackTrace();
       // return  new ResultBean("500",e.getMessage());
        return new ResultBean("404","你的操作有误,请重新再试!");
    }


}
