package io.codejournal.maven.jacoco.strings;

public class HelloName3 {

    public final String helloName3(final String name) {

        String greeting = "Hello";

        if (name != null && !name.isEmpty()) {
            greeting += " " + name;
        }

        return greeting + "!";
    }
}
