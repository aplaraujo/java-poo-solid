package org.example;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Mariazinha", 111, 50.00);
        Conta c2 = new Conta("Zequinha", 222, 100.00);
        Conta c3 = new Conta("Ritinha", 333, 150.00);

        System.out.println("---------------------------");
        c1.depositar(200.00);
        System.out.println(c1);

        System.out.println("---------------------------");
        c2.sacar(20.00);
        System.out.println(c2);

        System.out.println("---------------------------");
        c3.depositar(100.00);
        System.out.println(c3);
    }
}