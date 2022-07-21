package io.codejournal.maven.jacoco.numbers;

public class LastDigit3 {

    public final boolean lastDigit3(final int a, final int b) {

        final int lastDigitA = a % 10;
        final int lastDigitB = b % 10;

        return (lastDigitA == lastDigitB);
    }
}
