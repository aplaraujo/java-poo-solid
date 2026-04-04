package org.example;

public class Main {
    public static void main(String[] args) {
        Animal m = new Mamifero(22.5, 10);
        System.out.println(m.getIdade());
        System.out.println(m.getPeso());
        m.locomover();
        m.alimentar();
        m.emitirSom();
    }
}