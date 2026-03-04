package com.example.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        String user = System.getProperty("user.name", "developer");
        String message = greeting("Hello, " + user + "!");
        System.out.println(message);

        String now = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Time now: " + now);
    }

    public static String greeting(String input) {
        if (input == null || input.isBlank()) {
            return "Hello from Maven!";
        }
        return input.trim();
    }
}
