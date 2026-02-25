package org.example;

public class Main {
    public static void main(String[] args) {
        int i, j;

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] soma = somaMatrizes(mat, mat2);

        System.out.println("===============================");
        System.out.println("Matriz 1: ");

        for(i = 0; i < mat.length; i++) {
            for(j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");
        System.out.println("Matriz 2: ");

        for(i = 0; i < mat2.length; i++) {
            for(j = 0; j < mat2[0].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");
        System.out.println("Resultado da soma: ");

        for(i = 0; i < soma.length; i++) {
            for(j = 0; j < soma[0].length; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] somaMatrizes(int[][] matA, int[][] matB) {
        int[][] soma = new int[matA.length][matA[0].length];

        for(int i = 0; i < matA.length; i++) {
            for(int j = 0; j < matA[i].length; j++) {
                soma[i][j] = matA[i][j] + matB[i][j];
            }
        }

        return soma;
    }
}