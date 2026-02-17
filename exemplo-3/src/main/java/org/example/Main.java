package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();

        Data data = new Data();

        if (data.fixarData(dia, mes, ano)) {
            data.mostrarData();
        } else {
            System.out.println("Data inválida");
        }

        sc.close();
    }
}