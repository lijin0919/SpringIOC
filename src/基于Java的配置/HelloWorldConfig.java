package 基于Java的配置;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    /*
    <beans>
   <bean id="helloWorld" class="com.tutorialspoint.HelloWorld" />
</beans>
     */
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

    }

}
