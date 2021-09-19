package br.com.dio;


import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.setNome("Bilu");
        gato.setCor("Preto");
        gato.setIdade(3);

        System.out.println(gato);

        Livro livro1 = new Livro();
        livro1.setNome("O problema dos 3 corpos");
        livro1.setNumPaginas(300);

        Livro livro2 = new Livro();

        livro2.setNome("Os trabalhadores do mar");
        livro2.setNumPaginas(1580);

        System.out.println(livro1);
        System.out.println(livro2);



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

class Livro{
    private String nome;
    private Integer numPaginas;

    //Construtor
    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public Livro(String nome) {}

    public Livro() {

    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    //toString

    @Override
    public String toString() {
        return "Livro{" +
                "Nome do Livro='" + nome + '\'' +
                ", Número de Páginas= " + numPaginas + " páginas." +
                '}';
    }
}



