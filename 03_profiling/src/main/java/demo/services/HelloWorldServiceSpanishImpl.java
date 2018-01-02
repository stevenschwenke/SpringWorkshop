package demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Spring Profiling in Action! IN SPANISH! ;)";
    }
}
