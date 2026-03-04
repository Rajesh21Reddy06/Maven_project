package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void greetingReturnsDefaultForBlank() {
        String result = App.greeting("   ");
        assertEquals("Hello from Maven!", result);
    }

    @Test
    void greetingTrimsAndReturnsInput() {
        String result = App.greeting("  Hi Rajesh!  ");
        assertEquals("Hi Rajesh!", result);
    }
}
