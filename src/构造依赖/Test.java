package 构造依赖;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("di-config.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        te.image();
    }
}
