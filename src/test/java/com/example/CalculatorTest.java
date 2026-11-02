package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void sumarDosNumeros() {
        assertEquals(7.0, calculator.sumar(3.0, 4.0));
    }

    @Test
    void restarDosNumeros() {
        assertEquals(2.0, calculator.restar(5.0, 3.0));
    }

    @Test
    void multiplicarDosNumeros() {
        assertEquals(12.0, calculator.multiplicar(3.0, 4.0));
    }
}
