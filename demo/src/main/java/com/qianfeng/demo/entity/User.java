package com.qianfeng.demo.entity;

import java.util.Date;

/**
 * @author ZengJiFA
 * @Date 2019/7/29
 */
public class User {
    private String username;
    private String password;
    private Date createDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
