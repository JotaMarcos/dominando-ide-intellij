package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    //Constructor
    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Gato() {}

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //hashCode e equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gato)) return false;
        Gato gato = (Gato) o;
        return nome.equals(gato.nome) && cor.equals(gato.cor) && idade.equals(gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    //toString
    @Override
    public String toString() {
        return "Gato{" +
                "Nome do Gato='" + nome + '\'' +
                ", Cor do Gato='" + cor + '\'' +
                ", Idade do Gato= " + idade + " anos." +
                '}';
    }
}
