package org.example;

public class Pais {
    private String nome;
    private Long populacao;
    private double dimensao;

    public Pais(String nome, Long populacao, double dimensao) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    @Override
    public String toString() {
        return "Pais {" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", dimensao=" + dimensao +
                '}';
    }
}
