package io.codejournal.maven.jacoco.numbers;

public class LastDigit1 {

    public final boolean lastDigit1(final int a, final int b) {

        final int lastDigitA = a % 10;
        final int lastDigitB = b % 10;

        return (lastDigitA == lastDigitB);
    }
}
