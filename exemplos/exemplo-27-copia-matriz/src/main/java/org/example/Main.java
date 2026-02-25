package org.example;

public class Main {
    public static void main(String[] args) {
        int i, j;

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] copia = copiaMatriz(mat);

        System.out.println("===============================");
        System.out.println("Original: ");

        for(i = 0; i < mat.length; i++) {
            for(j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");
        System.out.println("Cópia: ");

        for(i = 0; i < copia.length; i++) {
            for(j = 0; j < copia[0].length; j++) {
                System.out.print(copia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] copiaMatriz(int[][] mat) {
        int[][] copia = new int[mat.length][];

        for(int i = 0; i < mat.length; i++) {
            copia[i] = new int[mat[i].length];
            for(int j = 0; j < mat[0].length; j++) {
                copia[i][j] = mat[i][j];
            }
        }

        return copia;
    }
}