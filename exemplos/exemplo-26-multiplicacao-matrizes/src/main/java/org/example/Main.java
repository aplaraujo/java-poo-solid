package org.example;

public class Main {
    public static void main(String[] args) {
        int i, j;

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] mult = multiplicaMatrizes(mat, mat2);

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
        System.out.println("Resultado da multiplicação: ");

        for(i = 0; i < mult.length; i++) {
            for(j = 0; j < mult[0].length; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicaMatrizes(int[][] matA, int[][] matB) {
        int linhasA = matA.length;
        int colunasA = matA[0].length;
        int linhasB = matB.length;
        int colunasB = matB[0].length;

        int i, j, k;

        if(colunasA != linhasB) {
            throw new IllegalArgumentException("Número de colunas de A deve ser igual ao número de linhas de B");
        }

        int[][] resultado = new int[linhasA][colunasB];

        for(i = 0; i < linhasA; i++) {
            for(j = 0; j < colunasB; j++) {
                for(k = 0; k < colunasA; k++) {
                    resultado[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }

        return resultado;
    }
}