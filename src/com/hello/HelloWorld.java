package com.hello;

import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean{
    private String message;//属性


    public void init(){
        System.out.println("初始化");
    }

    public String getMessage() {
        return message;
    }
//必须有
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }
}
