package mrk.klb.example.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingGeneratorTest {
    private static final String EXPECTED_GREETING = "Hello Mark";
    @Test
    void shouldGenerateGreetingMessage() {

        var messageGenerator = new GreetingGenerator();
        var actualGreeting = messageGenerator.generate("Mark");
        assertEquals(EXPECTED_GREETING, actualGreeting);
    }
}