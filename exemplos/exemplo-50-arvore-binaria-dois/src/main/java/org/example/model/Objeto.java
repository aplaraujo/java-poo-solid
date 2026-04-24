package org.example.model;

import java.util.Objects;

public class Objeto extends ObjetoArvore<Objeto>{

    Integer valor;

    public Objeto(Integer valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return Objects.equals(valor, objeto.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    @Override
    public int compareTo(Objeto outro) {
        int i = 0;
        if (this.valor > outro.valor) i = 1;
        else if (this.valor < outro.valor) i = -1;
        return i;
    }

    @Override
    public String toString() {
        return valor.toString();
    }
}
