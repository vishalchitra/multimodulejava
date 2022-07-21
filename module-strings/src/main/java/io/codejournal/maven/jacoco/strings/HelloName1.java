package io.codejournal.maven.jacoco.strings;

public class HelloName1 {

    public final String helloName1(final String name) {

        String greeting = "Hello";

        if (name != null && !name.isEmpty()) {
            greeting += " " + name;
        }

        return greeting + "!";
    }
}
