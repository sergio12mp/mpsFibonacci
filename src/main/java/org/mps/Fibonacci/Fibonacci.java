package org.mps.Fibonacci;

public class Fibonacci {

    public int compute(int value) {
        int result;

        if (value < 0) {
            throw new RuntimeException("The value is negative " + value);
        }

        if ((value == 0) || (value == 1))
            result = value;
        else
            result = (compute(value - 1) + compute(value - 2));

        return result;
    }
}
