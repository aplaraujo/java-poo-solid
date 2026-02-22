package org.example;

public class Contador {
    private Integer valor;

    public Contador() {
        this.valor = 0;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void incrementar() {
        this.valor += 1;
    }

    public void zerar() {
        this.valor = 0;
    }
}
