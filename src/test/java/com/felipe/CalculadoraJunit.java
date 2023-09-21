package com.felipe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.felipe.Calculadora;

/**
 * Unit test for simple App.
 */
public class CalculadoraJunit {
    /**
     * Rigorous Test :-)
     */

    Calculadora calc = new Calculadora();

    @Test
    public void adicao1() {
        int z = calc.soma(1, 4);
        assertEquals(5, z);
    }

    @Test
    public void adicao2() {
        int z = calc.soma(1, 0);
        assertEquals(1, z);
    }

    @Test
    public void adicao3() {
        int z = calc.soma(0, 0);
        assertEquals(0, z);
    }

    @Test
    public void adicao4() {
        int z = calc.soma(1, -4);
        assertEquals(-3, z);
    }

    @Test
    public void adicao5() {
        int z = calc.soma(0, -4);
        assertEquals(-4, z);
    }

    @Test
    public void subtracao1() {
        int z = calc.subtracao(2, 1);
        assertEquals(1, z);
    }

    @Test
    public void subtracao2() {
        int z = calc.subtracao(1, 2);
        assertEquals(-1, z);
    }

    @Test
    public void subtracao3() {
        int z = calc.subtracao(-2, 1);
        assertEquals(-3, z);
    }

    @Test
    public void subtracao4() {
        int z = calc.subtracao(2, -1);
        assertEquals(3, z);
    }

    @Test
    public void subtracao5() {
        int z = calc.subtracao(-2, -1);
        assertEquals(-1, z);
    }

    @Test
    public void subtracao6() {
        int z = calc.subtracao(0, 1);
        assertEquals(-1, z);
    }

    @Test
    public void subtracao7() {
        int z = calc.subtracao(0, 0);
        assertEquals(0, z);
    }

    @Test
    public void divisao1() {
        int z = calc.divisao(4, 2);
        assertEquals(2, z);
    }

    @Test
    public void divisao2() {
        int z = calc.divisao(2, 4);
        assertEquals(0.5, z);
    }

    @Test
    public void divisao3() {
        double z = calc.divisao(2, 4);
        assertEquals(0.5, z);
    }

    @Test
    public void divisao4() {
        int z = calc.divisao(4,-2);
        assertEquals(-2, z);
    }

    @Test
    public void divisao5() {
        int z = calc.divisao(-4,2);
        assertEquals(-2, z);
    }

    @Test
    public void divisao6() {
        int z = calc.divisao(-4, -2);
        assertEquals(2, z);
    }

    @Test
    public void divisao7() {
        int z = calc.divisao(-2, -4);
        assertEquals(0.5, z);
    }

    @Test
    public void multiplicacao1() {
        int z = calc.multiplicacao(3,3);
        assertEquals(9, z);
    }

    @Test
    public void multiplicacao2() {
        int z = calc.multiplicacao(3,-3);
        assertEquals(-9, z);
    }

    @Test
    public void multiplicacao3() {
        int z = calc.multiplicacao(-3,-3);
        assertEquals(9, z);
    }

    @Test
    public void multiplicacao4() {
        int z = calc.multiplicacao(0,-3);
        assertEquals(0, z);
    }
}
