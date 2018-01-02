package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        InjectedByConstructorService injectedByConstructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        injectedByConstructorService.getMessage();

        SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");
        setterBasedService.getMessage();
    }
}
