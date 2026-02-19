package org.example;

public class Eleitor {
    private String nome;
    private int anoNascimento;

    public Eleitor() {
    }

    public Eleitor(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public TipoDeEleitor getTipoDeEleitor() {
        int anoAtual = 2026;
        int idade = anoAtual - this.anoNascimento;
        if (idade < 16) return TipoDeEleitor.NAO_ELEITOR;
        if (idade < 18) return TipoDeEleitor.ELEITOR_FACULTATIVO;
        if (idade <= 65) return TipoDeEleitor.ELEITOR_OBRIGATORIO;
        return TipoDeEleitor.ELEITOR_FACULTATIVO;
    }
}
