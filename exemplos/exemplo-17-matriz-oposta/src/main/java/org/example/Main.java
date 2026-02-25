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

        int[][] oposta = matrizOposta(mat);

        System.out.println("==========================");
        System.out.println("Matriz oposta: ");

        for(i = 0; i < oposta.length; i++) {
            for(j = 0; j < oposta[0].length; j++) {
                System.out.print(oposta[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrizOposta(int[][]mat) {
        // Matriz oposta
        int linhas = mat.length;
        int colunas = mat[0].length;
        int[][] oposta = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                oposta[i][j] = -mat[i][j];
            }
        }

        return oposta;
    }
}