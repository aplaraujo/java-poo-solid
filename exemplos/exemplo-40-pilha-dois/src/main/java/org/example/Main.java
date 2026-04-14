package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> minhaPilha = new Stack<Integer>();
//

        if (minhaPilha.empty()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("A pilha não está vazia!");
        }
    }
}