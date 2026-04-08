package org.example;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(); // Instância da classe Conta

        c1.setSaldo(400.00);

        Conta c2 = c1;

        Conta c3 = new Conta();

        c3.setSaldo(400.00);

        System.out.println("========================");
        System.out.println("Saldo da conta 1: " + c1.getSaldo());
        System.out.println("Saldo da conta 2: " + c2.getSaldo());
        System.out.println("========================");
        System.out.println("São iguais? " + (c1 == c2));
        System.out.println("========================");
        System.out.println("Saldo da conta 3: " + c3.getSaldo());
        System.out.println("========================");
        System.out.println("São iguais? " + (c1 == c3));
        System.out.println("São iguais? " + (c2 == c3));
    }
}