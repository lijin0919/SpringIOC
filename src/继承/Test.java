package 继承;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("extends-config.xml");

        Parent objA = (Parent) context.getBean("parent");

        System.out.println(objA.getMessage1());
        System.out.println(objA.getMessage2());

        Son objB = (Son) context.getBean("son");
        System.out.println(objB.getMessage1());
        System.out.println(objB.getMessage2());

    }
}
