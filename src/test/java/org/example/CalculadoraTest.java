package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    final Calculadora calc = new Calculadora();

    @Test
    void sumar() {
        assertEquals(110, calc.sumar(150,180)/3);
        assertNotEquals(2700, calc.sumar(70,40)*25);

        assertEquals(5.2, calc.sumar(3.2,2));
        assertEquals(12, calc.sumar(10,2));
        assertNotEquals(1, calc.sumar(5,5));
    }

    @Test
    void restar() {
        assertNotEquals(605, calc.restar(90,50)*15);

        assertNotEquals(5.2, calc.restar(3.2,2));
        assertEquals(8, calc.restar(10,2));
        assertNotEquals(1, calc.restar(5,5));
    }

    @Test
    void multiplicar() {
        assertEquals(240, calc.multiplicar(80,3));

        assertEquals(6.4, calc.multiplicar(3.2,2));
        assertEquals(20, calc.multiplicar(10,2));
        assertNotEquals(1, calc.multiplicar(5,5));
    }

    @Test
    void dividir() {
        assertThrows(ArithmeticException.class, () ->calc.dividir(8,0));
        assertEquals(1.6, calc.dividir(3.2,2));
        assertEquals(5, calc.dividir(10,2));
        assertNotEquals(2, calc.dividir(5,5));
    }
}