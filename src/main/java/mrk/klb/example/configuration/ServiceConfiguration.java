package mrk.klb.example.configuration;

import mrk.klb.example.core.GreetingGenerator;
import mrk.klb.example.core.MessageGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    MessageGenerator greetingGenerator() {
        return new GreetingGenerator();
    }
}
