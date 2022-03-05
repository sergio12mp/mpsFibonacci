package org.mps.Fibonacci;

public class Fibonacci {
    /**
     *
     * Clase que calcula el @value fibonacci
     *
     * @author sergioM
     *
     * @value Numero de la sucesiones realizadas
     * @actual Término correspondiente a la cantidad de sucesiones realizadas
     */

    public long compute(int value) {

        if (value < 0) {
            throw new RuntimeException("The value is negative " + value);
        }
        if (value > 92) {
            throw new RuntimeException("The value is too big " + value);
        }

        long next = 1, actual = 0, temp;

        for (long i = 1; i <= value; i++) {
            temp = actual;
            actual = next;
            next = next + temp;
        }

        return actual;
    }
}
