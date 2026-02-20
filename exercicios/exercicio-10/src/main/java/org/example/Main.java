package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Zequinha", 6000.00, 2);
        System.out.println(f1.getSalarioMes());
        System.out.println(f1.calcularAumento(10));
        System.out.println(f1.calcularINSS());
        System.out.println(f1.calcularIR());
        System.out.println(f1.calcularIRPF());
    }
}