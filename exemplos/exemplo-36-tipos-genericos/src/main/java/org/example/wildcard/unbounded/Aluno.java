package org.example.wildcard.unbounded;

// Wildcard: pode ser usado com objetos de qualquer tipo genérico
public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno: { " +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                '}';
    }
}
