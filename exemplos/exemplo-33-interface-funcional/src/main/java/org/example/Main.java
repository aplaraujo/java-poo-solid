package org.example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MinhaInterfaceFuncional soma = (a, b) -> a + b;
        // Runnable - interface que não retorna valor
        Runnable run = () -> System.out.println("Hello");

        // Function - interface que tem um parâmetro de um determinado tipo e retorna um valor desse mesmo tipo
        Function<Integer, Integer> quadradoFunction = (num) -> num * num;

        // Bifunction - interface que tem dois parâmetros de um determinado tipo e retorna um valor desse mesmo tipo
        BiFunction<Integer, Integer, Integer> somaBiFunction = (a, b) -> a + b;

        // Supplier - interface que não recebe parâmetro, mas que recebe um valor de um determinado tipo
        Supplier<Integer> sup = () -> 20;

        // Consumer - interface que recebe um parâmetro, mas que não retorna um valor
        Consumer<Integer> con = System.out::println;

        // Predicate - interface que recebe um parâmetro, mas que retona um valor lógico (verdadeiro / falso)
        Predicate<Integer> verificaNumeroPar = num -> num % 2 == 0;

        System.out.println("Soma: " + soma.calcular(10, 20));

        run.run();

        System.out.println("Quadrado: " + quadradoFunction.apply(10));

        System.out.println("Nova soma: " + somaBiFunction.apply(10, 20));

        System.out.println("Imprimir número: " + sup.get());

        con.accept(20);

        System.out.println("Esse número é par? " + verificaNumeroPar.test(2));
        System.out.println("Esse número é par? " + verificaNumeroPar.test(5));
    }
}