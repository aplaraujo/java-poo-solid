 package org.example;

 import org.example.model.Objeto;

 public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Objeto> nossaArvore = new ArvoreBinaria<>();

        nossaArvore.inserir(new Objeto(13));
        nossaArvore.inserir(new Objeto(10));
        nossaArvore.inserir(new Objeto(25));
        nossaArvore.inserir(new Objeto(2));
        nossaArvore.inserir(new Objeto(12));
        nossaArvore.inserir(new Objeto(20));
        nossaArvore.inserir(new Objeto(31));
        nossaArvore.inserir(new Objeto(29));
        nossaArvore.inserir(new Objeto(32));

        nossaArvore.exibicaoEmOrdem();
        nossaArvore.exibicaoPosOrdem();
        nossaArvore.exibicaoPreOrdem();
    }
}