package com.felipe;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Adição
        // cenário 1: adição com dois valores inteiros
        int soma = calc.soma(1, 4);
        System.out.println(soma);

        // cenário 2: adição com um valor sendo 0
        int soma2 = calc.soma(1, 0);
        System.out.println(soma2);

        // cenário 3: adição com ambos os valores sendo 0
        int soma3 = calc.soma(0, 0);
        System.out.println(soma3);

        // cenário 4: adição com um valor negativo
        int soma4 = calc.soma(1, -4);
        System.out.println(soma4);

        // cenário 5: adição com um valor sendo 0 e outro negativo
        int soma5 = calc.soma(0, -4);
        System.out.println(soma5);

        // Subtração
        // cenário 1: subtração com o primeiro valor sendo maior
        int subtracao = calc.subtracao(2, 1);
        System.out.println(subtracao);

        // cenário 2: subtração com o segundo valor sendo maior
        int subtracao2 = calc.subtracao(1, 2);
        System.out.println(subtracao2);

        // cenário 3: subtração com o primeiro valor sendo negativo e o segundo positivo
        int subtracao3 = calc.subtracao(-2, 1);
        System.out.println(subtracao3);

        // cenário 4: subtração com o segundo valor sendo negativo e o primeiro positivo
        int subtracao4 = calc.subtracao(2, -1);
        System.out.println(subtracao4);

        // cenário 5: subtração com ambos os valores sendo negativos
        int subtracao5 = calc.subtracao(-2, -1);
        System.out.println(subtracao5);

        // cenário 6: subtração com um valor sendo 0
        int subtracao6 = calc.subtracao(0, 1);
        System.out.println(subtracao6);

        // cenário 7: subtração com dois valores sendo 0
        int subtracao7 = calc.subtracao(0, 0);
        System.out.println(subtracao7);

        // divisão
        // cenário 1: divisão comum
        int divisao = calc.divisao(4, 2);
        System.out.println(divisao);

        // cenário 2: divisão com divisor maior que dividendo || ERRO: não foi possivel
        // detectar números depois da vírgula, já que os parametros são do tipo int.
        // Recomendável utilizar double no lugar.
        int divisao2 = calc.divisao(2, 4);
        System.out.println(divisao2);

        // cenário 3: divisão com divisor maior que dividendo (agora com o valor da
        // variável sendo igual a double) || ERRO: não foi possivel detectar números
        // depois da vírgula, já que os parametros são do tipo int. Recomendável
        // utilizar double no lugar.
        double divisao3 = calc.divisao(2, 4);
        System.out.println(divisao3);

        // cenário 4: divisão comum com divisor negativo
        int divisao4 = calc.divisao(4, -2);
        System.out.println(divisao4);

        // cenário 5: divisão comum com dividendo negativo
        int divisao5 = calc.divisao(-4, 2);
        System.out.println(divisao5);

        // cenário 6: divisão comum com ambos os parametros negativos (dividendo maior)
        int divisao6 = calc.divisao(-4, -2);
        System.out.println(divisao6);

        // cenário 7: divisão comum com ambos os parametros negativos (divisor maior) ||
        // ERRO: não foi possivel detectar números depois da vírgula, já que os
        // parametros são do tipo int. Recomendável utilizar double no lugar.
        int divisao7 = calc.divisao(-2, -4);
        System.out.println(divisao7);

        // multiplicação
        // cenário 1: multiplicação comum
        int multiplicacao1 = calc.multiplicacao(3, 3);
        System.out.println(multiplicacao1);

        // cenário 2: multiplicação com número negativos
        int multiplicacao2 = calc.multiplicacao(3, -3);
        System.out.println(multiplicacao2);

        // cenário 3: multiplicação com números negativos
        int multiplicacao3 = calc.multiplicacao(-3, -3);
        System.out.println(multiplicacao3);

        // cenário 4: multiplicação com 0
        int multiplicacao4 = calc.multiplicacao(0, 3);
        System.out.println(multiplicacao4);
    }
}
