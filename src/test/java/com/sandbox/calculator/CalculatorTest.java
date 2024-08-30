package com.sandbox.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int expected = 10;
        int actual = Calculator.add(5,5);
        assertEquals(expected, actual);
    }

    @Test
    void testAdd() {
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}