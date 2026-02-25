package org.example;

public class Main {
    public static void main(String[] args) {
        int i, j;
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("==========================");
        System.out.println("Matriz: ");
        for(i = 0; i < mat.length; i++) {
            for(j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Matriz transposta
        int linhas = mat.length;
        int colunas = mat[0].length;
        int[][] transposta = new int[colunas][linhas];

        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                transposta[j][i] = mat[i][j];
            }
        }

        System.out.println("==========================");
        System.out.println("Matriz transposta: ");

        for(i = 0; i < transposta.length; i++) {
            for(j = 0; j < transposta[0].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}