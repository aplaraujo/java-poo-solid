package org.example;

public class Main {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        Conjunto conjunto1 = new Conjunto();

        Elemento el1 = new Elemento("Zequinha");
        Elemento el2 = new Elemento("Joãozinho");
        Elemento el3 = new Elemento("Mariazinha");

        Elemento el4 = new Elemento("Huguinho");
        Elemento el5 = new Elemento("Zezinho");
        Elemento el6 = new Elemento("Ritnha");
        Elemento el7 = new Elemento("Zequinha");



        conjunto.incluirElemento(el1);
        conjunto.incluirElemento(el2);
        conjunto.incluirElemento(el3);

        conjunto1.incluirElemento(el4);
        conjunto1.incluirElemento(el5);
        conjunto1.incluirElemento(el6);
        conjunto1.incluirElemento(el7);

        System.out.println(conjunto);
        System.out.println("==============================================");
        System.out.println(conjunto1);

        System.out.println(conjunto.uniao(conjunto1));
        System.out.println("==============================================");
        System.out.println(conjunto.inter(conjunto1));
        System.out.println("==============================================");
        System.out.println(conjunto.menos(conjunto1));
    }
}