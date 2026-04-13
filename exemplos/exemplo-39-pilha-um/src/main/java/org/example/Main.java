package org.example;

public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        p.empilhar(4);
        p.empilhar(5);
        p.imprimirPilha();
    }
}