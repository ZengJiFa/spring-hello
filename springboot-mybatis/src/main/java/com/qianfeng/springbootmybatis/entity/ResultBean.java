package com.qianfeng.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZengJiFA
 * @Date 2019/7/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBean<T> {
    private String respStatus;
    private T data;
}
