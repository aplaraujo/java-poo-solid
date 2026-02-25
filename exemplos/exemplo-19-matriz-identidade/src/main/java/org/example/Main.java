package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        System.out.println(matrizIdentidade(mat));
        System.out.println(matrizIdentidade(mat2));
    }

    public static boolean matrizIdentidade(int[][] mat) {
        boolean identidade = true;

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 1 && mat[i][j] != 0) {
                    identidade = false;
                    break;
                }
            }
        }
        return identidade;
    }
}