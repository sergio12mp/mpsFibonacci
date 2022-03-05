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
        long expectedValue = 0;
        long obtainerValue = fibonacci.compute(0);

        assertEquals(expectedValue,obtainerValue);
    }

    @Test
    public void shouldComputeReturn_1_IfTheNumberIs_1(){
        long expectedValue = 1;
        long obtainerValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtainerValue);
    }
    @Test
    public void shouldComputeReturn_1_IfTheNumberIs_2(){
        long expectedValue = 1;
        long obtainerValue = fibonacci.compute(2);

        assertEquals(expectedValue,obtainerValue);
    }
    @Test
    public void shouldComputeReturn_55_IfTheNumberIs_10(){
        long expectedValue = 55;
        long obtainerValue = fibonacci.compute(10);

        assertEquals(expectedValue,obtainerValue);
    }
    @Test
    public void shouldComputeReturn_12586269025_IfTheNumberIs_40(){
        long expectedValue = 102334155;
        long obtainerValue = fibonacci.compute(40);

        assertEquals(expectedValue,obtainerValue);
    }
    @Test
    public void shouldComputeOfANegativeNumberRaiseAnException() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
    @Test
    public void shouldComputeOfANumberBiggerThan_92_RaiseAnException() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(93));
    }
}
