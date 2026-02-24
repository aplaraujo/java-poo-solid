package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    private String codigoISO;
    private String nome;
    private Long populacao;
    private double dimensao;
    private final List<Pais> fronteira;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteira = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean isLimitrofe(Pais pais) {
        return this.fronteira.contains(pais);
    }

    public void adicionarFronteira(Pais pais) {
        this.fronteira.add(pais);
    }

    public double densidadePopulacional() {
        return this.populacao / this.dimensao;
    }

    public List<Pais> vizinhosComuns(Pais pais) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais p : this.fronteira) {
            if (pais.fronteira.contains(p)) {
                comuns.add(p);
            }
        }
        return comuns;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(codigoISO, pais.codigoISO);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codigoISO='" + codigoISO + '\'' +
                ", nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", dimensao=" + dimensao +
                ", fronteira=" + fronteira +
                '}';
    }
}
