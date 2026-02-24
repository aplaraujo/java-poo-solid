package org.example;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void incluirPais(Pais pais) {
        this.paises.add(pais);
    }

    public double dimensaoTotal() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getDimensao();
        }
        return total;
    }

    public Long populacaoTotal() {
        Long total = 0L;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    public double densidadePopulacional() {
        return this.populacaoTotal() / this.dimensaoTotal();
    }

    public Long paisMaiorPopulacao() {
        Long maior = this.paises.getFirst().getPopulacao();
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maior) {
                maior = pais.getPopulacao();
            }
        }
        return maior;
    }

    public Long paisMenorPopulacao() {
        Long menor = this.paises.getFirst().getPopulacao();
        for(Pais pais : paises) {
            if (pais.getPopulacao() < menor) {
                menor = pais.getPopulacao();
            }
        }
        return menor;
    }

    public double paisMaiorDimensao() {
        double maior = this.paises.getFirst().getDimensao();
        for(Pais pais : paises) {
            if (pais.getDimensao() > maior) {
                maior = pais.getDimensao();
            }
        }
        return maior;
    }

    public double paisMenorDimensao() {
        double menor = this.paises.getFirst().getDimensao();
        for(Pais pais : paises) {
            if (pais.getDimensao() < menor) {
                menor = pais.getDimensao();
            }
        }
        return menor;
    }

    public double razaoMaiorPaisMenorPais() {
        return this.paisMaiorDimensao() / this.paisMenorDimensao();
    }

    @Override
    public String toString() {
        return "Continente {" +
                "nome='" + nome + '\'' +
                ", paises=" + paises +
                '}';
    }
}
