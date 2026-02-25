package org.example;

public class Main {
    public static void main(String[] args) {
        int i, j;

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        System.out.println("===============================");
        System.out.println("Matriz: ");

        for(i = 0; i < mat.length; i++) {
            for(j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        if(simetrica(mat)) {
            System.out.println("A matriz é simétrica");
        } else {
            System.out.println("A matriz não é simétrica");
        }
    }

    // Verificar se a matriz é simétrica
    public static boolean simetrica(int[][] mat) {
        int n = mat.length;
        int i, j;

        for(i = 0; i < n; i++) {
            if(mat[i].length != n) return false;
        }

        for(i = 0; i < n; i++) {
            for(j = 0; j < i; j++) {
                if(mat[i][j] != mat[j][i]) return false;
            }
        }
        return true;
    }
}