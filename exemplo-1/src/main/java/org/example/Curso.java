package org.example;

public class Curso {
    private String nome;
    private int duracao;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", valor=" + valor +
                '}';
    }
}
