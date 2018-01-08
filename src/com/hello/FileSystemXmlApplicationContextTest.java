package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("E:/spring-config.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        System.out.println(obj.getMessage());
    }
}