package mrk.klb.example.service;

import mrk.klb.example.core.MessageGenerator;
import org.springframework.stereotype.Service;

@Service
public class ControllerService {

    private MessageGenerator greetingGenerator;

    public ControllerService(MessageGenerator greetingGenerator) {
        this.greetingGenerator = greetingGenerator;
    }

    public String generateGreeting(String name) {
        return greetingGenerator.generate(name);
    }
}
