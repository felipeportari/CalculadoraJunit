package com.felipe;

public class Calculadora {

    // calcula a soma de dois parâmetros
    public int soma(int a, int b) {
        System.out.println("");
        System.out.println("O resultado da soma entre " + a + " e " + b + " é:");
        return a + b;
    }

    // calcula a subtração de dois parâmetros
    public int subtracao(int a, int b) {
        System.out.println("");
        System.out.println("O resultado da subtração entre " + a + " e " + b + " é:");
        return a - b;
    }

    // calcula a divisão de dois parâmetros
    public int divisao(int a, int b) {
        System.out.println("");
        System.out.println("O resultado da divisão entre " + a + " e " + b + " é:");
        return a / b;
    }

    // calcula a multiplicação de dois parâmetros
    public int multiplicacao(int a, int b) {
        System.out.println("");
        System.out.println("O resultado da multiplicação entre " + a + " e " + b + " é:");
        return a * b;
    }
}
