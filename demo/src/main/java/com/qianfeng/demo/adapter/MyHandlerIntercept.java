package com.qianfeng.demo.adapter;

/**
 * @author ZengJiFA
 * @Date 2019/7/29
 */
public class MyHandlerIntercept extends HandlerInterceptorAdaptor{
    //引入中间类 中间类去实现接口的所有方法  自己在继承那个类 就可以实现部分方法
    @Override
    public void pre() {
        super.pre();
    }
}
