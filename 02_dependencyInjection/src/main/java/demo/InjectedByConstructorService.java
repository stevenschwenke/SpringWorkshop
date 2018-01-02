package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {

    private HelloWorldService helloWorldService;

    @Autowired
    public InjectedByConstructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage() {
        helloWorldService.sayHello();
    }
}
