package org.example;

public class Main {

    public static int dividir(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return num1/num2;
    }

    public static void main(String[] args) {
        try {
            dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}