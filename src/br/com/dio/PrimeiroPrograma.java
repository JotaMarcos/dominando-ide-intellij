package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.setNome("Bilu");
        gato.setCor("Preto");
        gato.setIdade(3);

        System.out.println(gato);

       /* int a = 5;
        int b = 3;
        System.out.println("=========================== Vamos lá Rachar a Cuca!!! ===========================");
        System.out.println("Olá, Mundo!!! \\o/\\o/\\o/");
        System.out.println( "A soma de a + b é igual a: " + (a+b));
        System.out.println( "A subtração de a - b é igual a: " + (a -b));
        System.out.println( "A multiplicação de a * b é igual a: " + (a*b));
        System.out.println( "A divisão de a / b é igual a: " + (a/b));
        System.out.println( "A potência de a elevado b é igual a: " + Math.pow(a,b));
        System.out.println("============================ Até o Próximo Desafio!!! ============================");*/


    }
}
