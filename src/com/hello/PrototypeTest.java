package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        System.out.println(objA.getMessage());
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        System.out.println(objB.getMessage());
    }
}
