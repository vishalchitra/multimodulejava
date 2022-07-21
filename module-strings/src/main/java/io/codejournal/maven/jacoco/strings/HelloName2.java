package io.codejournal.maven.jacoco.strings;

public class HelloName2 {

    public final String helloName2(final String name) {

        String greeting = "Hello";

        if (name != null && !name.isEmpty()) {
            greeting += " " + name;
        }

        return greeting + "!";
    }
}
