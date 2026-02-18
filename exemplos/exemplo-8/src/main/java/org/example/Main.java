package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Peca p1 = new Peca(13, 1, 5.30);
        Peca p2 = new Peca(16, 2, 5.10);

        double total = p1.total() + p2.total();

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}