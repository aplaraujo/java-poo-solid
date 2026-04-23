package org.example;

public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> nossaLista = new ListaCircular<>();

        nossaLista.add(124);
        nossaLista.add(67);
        nossaLista.add(64);
        nossaLista.add(152);
        nossaLista.add(107);
        nossaLista.add(173);
        nossaLista.add(154);
        nossaLista.add(8);
        nossaLista.add(33);
        nossaLista.add(184);
        nossaLista.add(65);
        nossaLista.add(88);

        System.out.println(nossaLista);

        nossaLista.remove(0);

        System.out.println("===========================");
        System.out.println("===== Lista atualizada ====");

        System.out.println(nossaLista);

        System.out.println(nossaLista.get(5));
        System.out.println(nossaLista.get(11));

    }
}