package demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {
    public void sayHello(){
        System.out.println("DI for the win!!!!");
    }
}
