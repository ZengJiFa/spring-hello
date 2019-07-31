package com.qianfeng.demo.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author ZengJiFA
 * @Date 2019/7/29
 */
@Component
@Configuration
public class MyResources {


    @Value("${image.serverpath}")
    private String image;
    @Value("${resources.serverpath}")
    private String resources;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }
}
