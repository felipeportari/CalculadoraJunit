package com.felipe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.felipe.Calculadora;

/**
 * Classe de teste unitário para a classe Calculadora.
 */
public class CalculadoraJunit {

    // Instância da Calculadora para testes
    Calculadora calc = new Calculadora();

    // Adição
    // cenário 1: adição com dois valores inteiros
    @Test
    public void adicao1() {
        int z = calc.soma(1, 4);
        assertEquals(5, z);
    }

    // cenário 2: adição com um valor sendo 0
    @Test
    public void adicao2() {
        int z = calc.soma(1, 0);
        assertEquals(1, z);
    }

    // cenário 3: adição com ambos os valores sendo 0
    @Test
    public void adicao3() {
        int z = calc.soma(0, 0);
        assertEquals(0, z);
    }

    // cenário 4: adição com um valor negativo
    @Test
    public void adicao4() {
        int z = calc.soma(1, -4);
        assertEquals(-3, z);
    }

    // cenário 5: adição com um valor sendo 0 e outro negativo
    @Test
    public void adicao5() {
        int z = calc.soma(0, -4);
        assertEquals(-4, z);
    }

    // Subtração
    // cenário 1: subtração com o primeiro valor sendo maior
    @Test
    public void subtracao1() {
        int z = calc.subtracao(2, 1);
        assertEquals(1, z);
    }

    // cenário 2: subtração com o segundo valor sendo maior
    @Test
    public void subtracao2() {
        int z = calc.subtracao(1, 2);
        assertEquals(-1, z);
    }

    // cenário 3: subtração com o primeiro valor sendo negativo e o segundo positivo
    @Test
    public void subtracao3() {
        int z = calc.subtracao(-2, 1);
        assertEquals(-3, z);
    }

    // cenário 4: subtração com o segundo valor sendo negativo e o primeiro positivo
    @Test
    public void subtracao4() {
        int z = calc.subtracao(2, -1);
        assertEquals(3, z);
    }

    // cenário 5: subtração com ambos os valores sendo negativos
    @Test
    public void subtracao5() {
        int z = calc.subtracao(-2, -1);
        assertEquals(-1, z);
    }

    // cenário 6: subtração com um valor sendo 0
    @Test
    public void subtracao6() {
        int z = calc.subtracao(0, 1);
        assertEquals(-1, z);
    }

    // cenário 7: subtração com dois valores sendo 0
    @Test
    public void subtracao7() {
        int z = calc.subtracao(0, 0);
        assertEquals(0, z);
    }

    // divisão
    // cenário 1: divisão comum
    @Test
    public void divisao1() {
        int z = calc.divisao(4, 2);
        assertEquals(2, z);
    }

    // cenário 2: divisão com divisor maior que dividendo || ERRO: não foi possivel
    // detectar números depois da vírgula, já que os parametros são do tipo int.
    // Recomendável utilizar double no lugar.
    @Test
    public void divisao2() {
        int z = calc.divisao(2, 4);
        assertEquals(0.5, z);
    }

    // cenário 2: divisão com divisor maior que dividendo || ERRO: não foi possivel
    // detectar números depois da vírgula, já que os parametros são do tipo int.
    // Recomendável utilizar double no lugar.
    @Test
    public void divisao3() {
        double z = calc.divisao(2, 4);
        assertEquals(0.5, z);
    }

    // cenário 4: divisão comum com divisor negativo
    @Test
    public void divisao4() {
        int z = calc.divisao(4, -2);
        assertEquals(-2, z);
    }

    // cenário 5: divisão comum com dividendo negativo
    @Test
    public void divisao5() {
        int z = calc.divisao(-4, 2);
        assertEquals(-2, z);
    }

    // cenário 6: divisão comum com ambos os parametros negativos (dividendo maior)
    @Test
    public void divisao6() {
        int z = calc.divisao(-4, -2);
        assertEquals(2, z);
    }

    // cenário 7: divisão comum com ambos os parametros negativos (divisor maior) ||
    // ERRO: não foi possivel detectar números depois da vírgula, já que os
    // parametros são do tipo int. Recomendável utilizar double no lugar.
    @Test
    public void divisao7() {
        int z = calc.divisao(-2, -4);
        assertEquals(0.5, z);
    }

    // multiplicação
    // cenário 1: multiplicação comum
    @Test
    public void multiplicacao1() {
        int z = calc.multiplicacao(3, 3);
        assertEquals(9, z);
    }

    // cenário 2: multiplicação com número negativos
    @Test
    public void multiplicacao2() {
        int z = calc.multiplicacao(3, -3);
        assertEquals(-9, z);
    }

    // cenário 3: multiplicação com números negativos
    @Test
    public void multiplicacao3() {
        int z = calc.multiplicacao(-3, -3);
        assertEquals(9, z);
    }

    // cenário 4: multiplicação com 0
    @Test
    public void multiplicacao4() {
        int z = calc.multiplicacao(0, -3);
        assertEquals(0, z);
    }
}
