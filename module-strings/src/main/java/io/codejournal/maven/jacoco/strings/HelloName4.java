package io.codejournal.maven.jacoco.strings;

public class HelloName4 {

    public final String helloName4(final String name) {

        String greeting = "Hello";

        if (name != null && !name.isEmpty()) {
            greeting += " " + name;
        }

        return greeting + "!";
    }
}
