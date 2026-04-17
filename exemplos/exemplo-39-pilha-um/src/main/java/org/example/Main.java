package org.example;

public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilhar(new No(1));
        p.empilhar(new No(2));
        p.empilhar(new No(3));
        p.empilhar(new No(4));
        p.empilhar(new No(5));

        System.out.println(p);
    }
}