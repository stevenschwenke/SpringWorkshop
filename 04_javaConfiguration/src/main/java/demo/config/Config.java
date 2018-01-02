package demo.config;

import demo.services.HelloWorldService;
import demo.services.HelloWorldServiceEnglishImpl;
import demo.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }

}
