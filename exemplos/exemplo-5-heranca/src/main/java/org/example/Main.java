package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Programa principal
        Date d1 = new Date();

        Livro l1 = new Livro();
        LivroDeLivraria l2 = new LivroDeLivraria();
        LivroDeBiblioteca l3 = new LivroDeBiblioteca();

        l1.setTitulo("Minha trajetória no Java");
        l1.setAutor("Mariana da Mata");
        l1.setNumPaginas(200);
        l1.setAnoLancamento(2000);
        l1.setIsbn("0-8406-5520-7");

        l2.setPreco(25.00);
        l3.setDataEmprestimo(d1);
        l3.setEmprestadoPara("Mariazinha");
        System.out.println(l1.toString());
        System.out.println(l2.getPreco());
        System.out.println(l3.getDataEmprestimo());
        System.out.println(l3.getEmprestadoPara());

    }
}