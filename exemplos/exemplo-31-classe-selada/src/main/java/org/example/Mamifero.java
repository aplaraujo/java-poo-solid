package org.example;

public final class Mamifero extends Animal {
    Mamifero(double peso, int idade) {
        super(peso, idade);
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
