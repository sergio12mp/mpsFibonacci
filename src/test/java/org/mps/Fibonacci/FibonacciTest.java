package org.mps.Fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void Setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldComputeReturn_0_IfTheNumberIs_0(){
        int expectedValue = 0;
        int obtainerValue = fibonacci.compute(0);

        assertEquals(expectedValue,obtainerValue);
    }

    @Test
    public void shouldComputeReturn_1_IfTheNumberIs_1(){
        int expectedValue = 1;
        int obtainerValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtainerValue);
    }
    @Test
    public void shouldComputeReturn_1_IfTheNumberIs_2(){
        int expectedValue = 1;
        int obtainerValue = fibonacci.compute(2);

        assertEquals(expectedValue,obtainerValue);
    }
    @Test
    public void shouldComputeReturn_55_IfTheNumberIs_10(){
        int expectedValue = 55;
        int obtainerValue = fibonacci.compute(10);

        assertEquals(expectedValue,obtainerValue);
    }

    @Test
    public void shouldComputeOfANegativeNumberRaiseAnException() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

}
