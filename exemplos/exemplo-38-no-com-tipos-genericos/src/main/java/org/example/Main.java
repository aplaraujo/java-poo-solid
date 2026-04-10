package org.example;

public class Main {
    public static void main(String[] args) {
        NoGenerico<Integer> n1 = new NoGenerico<Integer>(100);
        NoGenerico<String> n2 = new NoGenerico<String>("Hello");
        n1.setProximo(n2);
        NoGenerico<Double> n3 = new NoGenerico<Double>(5.5);
        n2.setProximo(n3);
        NoGenerico<Boolean> n4 = new NoGenerico<Boolean>(true);
        n3.setProximo(n4);

        System.out.println("===========================");
        System.out.println(n1);
        System.out.println(n1.getProximo());
        System.out.println(n1.getProximo().getProximo());
        System.out.println(n1.getProximo().getProximo().getProximo());
        System.out.println(n1.getProximo().getProximo().getProximo().getProximo());
    }
}