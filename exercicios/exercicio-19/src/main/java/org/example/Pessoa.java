package org.example;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public boolean saoIrmas(Pessoa pessoa) {
        return (this.pai != null && this.pai.equals(pessoa.pai)) || (this.mae != null && this.mae.equals(pessoa.mae));
    }

    public boolean isAntecessora(Pessoa candidato) {
        if (candidato == null) {
            return false;
        }

        if (candidato.equals(this.pai) || candidato.equals(this.mae)) {
            return true;
        }

        boolean antecedeNaLinhaDoPai = (this.pai != null) && this.pai.isAntecessora(candidato);
        boolean antecedeNaLinhaDaMae = (this.mae != null) && this.mae.isAntecessora(candidato);

        return antecedeNaLinhaDoPai || antecedeNaLinhaDaMae;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(mae, pessoa.mae);
    }


}
