package org.example;

public sealed abstract class Animal permits Mamifero{
    private final double peso;
    private final int idade;

    protected Animal(double peso, int idade) {
        this.peso = peso;
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
