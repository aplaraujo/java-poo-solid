package org.example;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa: [nome = " + nome + ", idade = " + idade + "]";
    }

    // Verifica se o objeto instanciado é igual ao objeto passado como parâmetro
    @Override
    public boolean equals(Object objeto) {
        Pessoa pessoa = (Pessoa) objeto; // Criação do objeto com Casting
        return this.nome.equals(pessoa.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.charAt(0);
    }
}
