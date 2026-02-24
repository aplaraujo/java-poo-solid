package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conjunto {
    private final List<Elemento> elementos;

    public Conjunto() {
        this.elementos = new ArrayList<>();
    }

    public void incluirElemento(Elemento elemento) {
        if (this.elementos.contains(elemento)) {
            System.out.println("Esse nome já existe na lista!");
        } else {
            this.elementos.add(elemento);
            System.out.println("Nome incluído com sucesso!");
        }
    }

    public void elementoExiste(Elemento elemento) {
        if (this.elementos.contains(elemento)) {
            System.out.println("Esse nome já existe na lista!");
        } else {
            System.out.println("Esse nome não existe na lista!");
        }
    }

    public Conjunto uniao(Conjunto vet) {
        Conjunto novo = new Conjunto();
        for(Elemento el : this.elementos) {
            novo.incluirElemento(el);
        }

        for(Elemento el : vet.elementos) {
            novo.incluirElemento(el);
        }

        return novo;
    }

    public Conjunto inter(Conjunto vet) {
        Conjunto novo = new Conjunto();
        for(Elemento el : this.elementos) {
            if (vet.elementos.contains(el)) {
                novo.incluirElemento(el);
            }
        }
        return novo;
    }

    public Conjunto menos(Conjunto vet) {
        Conjunto novo = new Conjunto();
        for(Elemento el : this.elementos) {
            novo.incluirElemento(el);
        }

        for(Elemento el : vet.elementos) {
            if (!this.elementos.contains(el)) novo.incluirElemento(el);
        }

        return novo;
    }

    @Override
    public String toString() {
        return "Conjunto {" +
                "elementos=" + elementos +
                '}';
    }
}
