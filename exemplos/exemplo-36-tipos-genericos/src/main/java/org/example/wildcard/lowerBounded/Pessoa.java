package org.example.wildcard.lowerBounded;

// Wildcard limitado inferiomente: pode ser usado com listas de tipos apenas da classe mãe
public class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa: {" +
                "nome ='" + nome + '\'' +
                ", idade = " + idade +
                ", genero ='" + genero + '\'' +
                '}';
    }
}
