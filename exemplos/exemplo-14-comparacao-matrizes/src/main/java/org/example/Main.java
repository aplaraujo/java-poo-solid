package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}};

        // Comparar o conteúdo de duas matrizes
        System.out.println("As matrizes são iguais? " + compararMatrizes(mat1, mat2));
    }

    public static boolean compararMatrizes(int[][]matA, int[][]matB) {
        return Arrays.deepEquals(matA, matB);
    }
}