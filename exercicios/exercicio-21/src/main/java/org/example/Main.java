package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matriz mat1 = new Matriz(2, 2);
        mat1.inserirElemento(0, 0, 1);
        mat1.inserirElemento(0, 1, 2);
        mat1.inserirElemento(1, 0, 3);
        mat1.inserirElemento(1, 1, 4);

        Matriz mat2 = new Matriz(2, 2);
        mat2.inserirElemento(0, 0, 4);
        mat2.inserirElemento(0, 1, 3);
        mat2.inserirElemento(1, 0, 2);
        mat2.inserirElemento(1, 1, 1);

        Matriz matriz = new Matriz(2, 3);

        matriz.inserirElemento(0, 0, 1);
        matriz.inserirElemento(0, 1, 2);
        matriz.inserirElemento(0, 2, 3);
        matriz.inserirElemento(1, 0, 4);
        matriz.inserirElemento(1, 1, 5);
        matriz.inserirElemento(1, 2, 6);

        Matriz mat3 = new Matriz(5, 5);

        Matriz mat4 = new Matriz(2, 2);
        mat4.inserirElemento(0, 0, 1);
        mat4.inserirElemento(0, 1, 0);
        mat4.inserirElemento(1, 0, 0);
        mat4.inserirElemento(1, 1, 1);

        System.out.println("==================================");
        System.out.println("Matriz: ");
        matriz.getMatriz();

        System.out.println("==================================");
        System.out.println("Matriz transposta: ");
        matriz.matrizTransposta().getMatriz();

        System.out.println("==================================");
        System.out.println("Matriz oposta: ");
        matriz.matrizOposta().getMatriz();

        System.out.println("==================================");
        System.out.println("Matriz nula: ");
        mat3.matrizNula();

        System.out.println("==================================");
        System.out.println("Essa matriz é identidade? " + mat4.matrizIdentidade());

        System.out.println("==================================");
        System.out.println("Essa matriz é diagonal? " + mat4.matrizDiagonal());

        System.out.println("==================================");
        System.out.println("Essa matriz é singular? " + mat2.isDeterminante(2));

        System.out.println("==================================");
        System.out.println("Essa matriz é simétrica? " + mat4.isSimetrica());

        System.out.println("==================================");
        System.out.println("Essa matriz é anti-simétrica? " + mat1.isAntiSimetrica());

        System.out.println("==================================");
        System.out.println("Resultado da soma: ");
        mat1.somaMatrizes(mat2).getMatriz();

        System.out.println("==================================");
        System.out.println("Resultado da subtração: ");
        mat1.subtracaoMatrizes(mat2).getMatriz();

        System.out.println("==================================");
        System.out.println("Resultado da multiplicação: ");
        mat1.multiplicacaoMatrizes(mat2).getMatriz();

        System.out.println("==================================");
        System.out.println("Cópia: ");
        mat1.copiaMatriz().getMatriz();
    }
}