package springboot;

import demo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("demo")
public class JavaConfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(JavaConfigurationApplication.class, args);
        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();
    }
}
