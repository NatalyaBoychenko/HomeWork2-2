package com.boichenko;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumOf1Number(){
        int  actual = sumCalculator.sum(1);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testSumOf3Numbers(){
        int  actual = sumCalculator.sum(3);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testIllegalArgExceptionWhen0Sum(){
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }

}