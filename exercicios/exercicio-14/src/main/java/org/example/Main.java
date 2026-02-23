package org.example;

public class Main {
    public static void main(String[] args) {
        NumeroComplexo comp1 = new NumeroComplexo(2.0, 3.0);
        NumeroComplexo comp2 = new NumeroComplexo(4.0, 5.0);

        NumeroComplexo soma = comp1.somar(comp2);
        NumeroComplexo sub = comp1.subtrair(comp2);
        NumeroComplexo mult = comp1.multiplicar(comp2);
        NumeroComplexo div = comp1.dividir(comp2);
        System.out.println(comp1 + " + " + comp2 + " = " + soma);
        System.out.println(comp1 + " - " + comp2 + " = " + sub);
        System.out.println(comp1 + " * " + comp2 + " = " + mult);
        System.out.println(comp1 + " / " + comp2 + " = " + div);
    }
}