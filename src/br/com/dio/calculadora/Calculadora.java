package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("============================== Vamos lá Calcular ==============================");
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();
        System.out.println("\n================================= Os Resutados ===============================");

        int soma = soma(a,b);
        int subtracao = subtracao(a,b);
        int multiplicacao = multiplicacao(a,b);
        double divisao = divisao(a,b);

        System.out.println("A Soma é igual a: " + soma);
        System.out.println("A Subtração é igual a: " + subtracao);
        System.out.println("A Multiplicação é igual a: " + multiplicacao);
        System.out.println("A Divisão é igual a: " + divisao);

        System.out.println("=========================== Até a Próxima \\o/\\o/\\o/ ===========================");

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }


}
