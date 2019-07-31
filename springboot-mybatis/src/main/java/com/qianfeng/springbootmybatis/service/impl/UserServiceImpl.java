package com.qianfeng.springbootmybatis.service.impl;

import com.qianfeng.springbootmybatis.entity.TUser;
import com.qianfeng.springbootmybatis.mapper.TUserMapper;
import com.qianfeng.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZengJiFA
 * @Date 2019/7/30
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
