package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date d1 = new Date();

        Livro livro = new Livro("Meninas Malvadas e Mimadas", "Bruna Aragão", 250, 2000, "0-1800-1780-2");
        LivroDeLivraria l1 = new LivroDeLivraria(livro, 30.00);
        LivroDeBiblioteca l2 = new LivroDeBiblioteca(livro, d1, "Mariazinha");

        System.out.println(livro);
        System.out.println(l1);
        System.out.println(l2);
    }
}