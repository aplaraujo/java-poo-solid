package org.example;

public class Main {
    public static void main(String[] args) {
        int i, j;

        // Matriz nula
        int[][] nula = new int[4][4];

        System.out.println("=======================");
        System.out.println("Matriz nula: ");
        for(i = 0; i < nula.length; i++) {
            for(j = 0; j < nula[0].length; j++) {
                System.out.print(nula[i][j] + " ");
            }
            System.out.println();
        }
    }
}