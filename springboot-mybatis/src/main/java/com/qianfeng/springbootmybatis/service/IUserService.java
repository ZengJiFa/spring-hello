package com.qianfeng.springbootmybatis.service;

import com.qianfeng.springbootmybatis.entity.TUser;

/**
 * @author ZengJiFA
 * @Date 2019/7/30
 */
public interface IUserService {
    TUser getById(Long id);
}
