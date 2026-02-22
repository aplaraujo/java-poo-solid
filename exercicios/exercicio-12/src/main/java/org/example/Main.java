package org.example;

public class Main {
    public static void main(String[] args) {
        Contador cont = new Contador();

        System.out.println("Valor atual: " + cont.getValor());
        cont.incrementar();
        System.out.println("Valor atual: " + cont.getValor());
        cont.incrementar();
        System.out.println("Valor atual: " + cont.getValor());
        cont.zerar();
        System.out.println("Valor atual: " + cont.getValor());
    }
}