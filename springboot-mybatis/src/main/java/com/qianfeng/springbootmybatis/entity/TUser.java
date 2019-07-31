package com.qianfeng.springbootmybatis.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class TUser {
    private Long id;

    @NonNull
    private String username;

    private String password;

    public TUser() {
    }

    public TUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


}