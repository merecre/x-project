package mrk.klb.example.core;

public class GreetingGenerator implements MessageGenerator {
    @Override
    public String generate(String name) {
        return "Hello " + name;
    }
}
