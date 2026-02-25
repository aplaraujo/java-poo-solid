package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Matriz nula: ");
        matrizNula(4, 4);
    }

    public static void matrizNula(int linha, int coluna) {
        int[][] mat = new int[linha][coluna];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}