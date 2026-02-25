package org.example;

public class Main {
    public static void main(String[] args) {
        int i, j;
        int ordem = 3;

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        System.out.println("===============================");
        System.out.println("Matriz: ");

        for(i = 0; i < mat2.length; i++) {
            for(j = 0; j < mat2[0].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===============================");
        int determinante = calcularDeterminante(mat2, ordem);

        System.out.println("Determinante: " + determinante);


        if(determinante == 0) {
            System.out.println("A matriz é singular");
        } else {
            System.out.println("A matriz não é singular");
        }
    }

    // Encontrar o determinante da matriz de qualquer ordem
    public static int calcularDeterminante(int[][] mat, int ordem) {

        int determinante = 0;
        int[][] cofatores = new int[ordem][ordem];
        int sinal = 1;

        if(ordem == 1) return mat[0][0];

        for(int f = 0; f < ordem; f++) {
            cofator(mat, cofatores, 0, f, ordem);
            determinante = determinante + (sinal * mat[0][f] + calcularDeterminante(cofatores, ordem - 1));
            sinal = - sinal;
        }
        return determinante;
    }

    // Encontrar o cofator
    public static void cofator(int[][] mat, int[][] temp, int l, int c, int ordem) {
        int i = 0;
        int j = 0;

        for(int linha = 0; linha < ordem; linha++) {
            for(int coluna = 0; coluna < ordem; coluna++) {
                if(linha != l && coluna != c) {
                    temp[i][j++] = mat[linha][coluna];
                    if(j == ordem - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
}