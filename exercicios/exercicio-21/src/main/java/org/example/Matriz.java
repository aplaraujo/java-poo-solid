package org.example;

import java.util.Objects;

public class Matriz {
    private int linha;
    private int coluna;
    private int[][] elementos;

    public Matriz(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.elementos = new int[this.linha][this.coluna];
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void inserirElemento(int linha, int coluna, int valor) {
        this.elementos[linha][coluna] = valor;
    }

    public int getElemento(int linha, int coluna) {
        return this.elementos[linha][coluna];
    }

    public void getMatriz() {
        for(int i = 0; i < this.linha; i++) {
            for(int j = 0; j < this.coluna; j++) {
                System.out.print(this.elementos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matriz matrizTransposta() {
        Matriz transposta = new Matriz(this.coluna, this.linha);

        for(int i = 0; i < this.linha; i++) {
            for(int j = 0; j < this.coluna; j++) {
                transposta.inserirElemento(j, i, this.elementos[i][j]);
            }
        }

        return transposta;
    }

    public Matriz matrizOposta() {
        Matriz oposta = new Matriz(this.linha, this.coluna);

        for(int i = 0; i < this.linha; i++) {
            for(int j = 0; j < this.coluna; j++) {
                oposta.inserirElemento(i, j, -this.elementos[i][j]);
            }
        }

        return oposta;
    }

    public void matrizNula() {
        Matriz mat = new Matriz(this.linha, this.coluna);
        for(int i = 0; i < this.linha; i++) {
            for(int j = 0; j < this.coluna; j++) {
                System.out.print(this.elementos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean matrizIdentidade() {
        boolean identidade = true;

        for(int i = 0; i < this.elementos.length; i++) {
            for(int j = 0; j < this.elementos[0].length; j++) {
                if (this.elementos[i][j] != 1 && this.elementos[i][j] != 0) {
                    identidade = false;
                    break;
                }
            }
        }
        return identidade;
    }

    public boolean matrizDiagonal() {
        boolean diagonal = true;

        for(int i = 0; i < this.elementos.length; i++) {
            for(int j = 0; j < this.elementos[0].length; j++) {
                if(i != j && this.elementos[i][j] != 0) {
                    diagonal = false;
                    break;
                }
            }
        }
        return diagonal;
    }

    public boolean isDeterminante(int ordem) {
        return calcularDeterminante(ordem) == 0;
    }

    public boolean isSimetrica() {
        int n = this.elementos.length;
        int i, j;

        for(i = 0; i < n; i++) {
            if (this.elementos[i].length != n) return false;
        }

        for(i = 0; i < n; i++) {
            for(j = 0; j < i; j++) {
                if(this.elementos[i][j] != this.elementos[j][i]) return false;
            }
        }
        return true;
    }

    public boolean isAntiSimetrica() {
        int n = this.elementos.length;
        int i, j;

        for(i = 0; i < n; i++) {
            if (this.elementos[i].length != n) return false;
        }

        for(i = 0; i < n; i++) {
            for(j = 0; j < i; j++) {
                if(this.elementos[i][j] != -this.elementos[j][i]) return false;
            }
        }
        return true;
    }

    public Matriz somaMatrizes(Matriz mat) {

        if (this.linha != mat.linha || this.coluna != mat.coluna) {
            throw new IllegalArgumentException("As matrizes precisam ter as mesmas dimensões para serem somadas.");
        }

        Matriz soma = new Matriz(this.elementos.length, this.elementos[0].length);

        for(int i = 0; i < this.elementos.length; i++) {
            for(int j = 0; j < this.elementos[0].length; j++) {
                soma.inserirElemento(i, j, (this.elementos[i][j] + mat.elementos[i][j]));
            }
        }
        return soma;
    }

    public Matriz subtracaoMatrizes(Matriz mat) {

        if (this.linha != mat.linha || this.coluna != mat.coluna) {
            throw new IllegalArgumentException("As matrizes precisam ter as mesmas dimensões para serem somadas.");
        }

        Matriz soma = new Matriz(this.elementos.length, this.elementos[0].length);

        for(int i = 0; i < this.elementos.length; i++) {
            for(int j = 0; j < this.elementos[0].length; j++) {
                soma.inserirElemento(i, j, (this.elementos[i][j] - mat.elementos[i][j]));
            }
        }
        return soma;
    }

    public Matriz multiplicacaoMatrizes(Matriz mat) {
        int linA = this.elementos.length;
        int colA = this.elementos[0].length;
        int linB = mat.elementos.length;
        int colB = mat.elementos[0].length;

        int i, j, k;

        if (colA != linB) throw new IllegalArgumentException("Número de colunas de A deve ser igual ao número de linhas de B");

        Matriz resultado = new Matriz(linA, colB);

        for(i = 0; i < linA; i++) {
            for(j = 0; j < colB; j++) {
                for(k = 0; k < colA; k++) {
                    resultado.inserirElemento(i, j, (this.elementos[i][k] * mat.elementos[k][j]));
                }
            }
        }

        return resultado;
    }

    public Matriz copiaMatriz() {
        Matriz copia = new Matriz(this.linha, this.coluna);

        for(int i = 0; i < this.linha; i++) {
            for(int j = 0; j < this.coluna; j++) {
                copia.inserirElemento(i, j, this.elementos[i][j]);
            }
        }

        return copia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Matriz matriz = (Matriz) o;
        return Objects.deepEquals(elementos, matriz.elementos);
    }

    private void cofator(int l, int c, int ordem) {
        int i = 0;
        int j = 0;
        Matriz temp = new Matriz(this.linha, this.coluna);

        for(int linha = 0; linha < ordem; linha++) {
            for(int coluna = 0; coluna < ordem; coluna++) {
                if (linha != l && coluna != c) {
                    temp.inserirElemento(i, j++, this.elementos[i][j]);
                    if (j == ordem - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    private int calcularDeterminante(int ordem) {

        int determinante = 0;
        Matriz cofatores = new Matriz(ordem, ordem);
        int sinal = 1;

        if(ordem == 1) return this.elementos[0][0];

        for(int f = 0; f < ordem; f++) {
            cofator(0, f, ordem);
            determinante = determinante + (sinal * this.elementos[0][f] + calcularDeterminante(ordem - 1));
            sinal = - sinal;
        }
        return determinante;
    }

}
