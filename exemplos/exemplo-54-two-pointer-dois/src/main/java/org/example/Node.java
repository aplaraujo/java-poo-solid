package org.example;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Nó: [conteúdo = " + data + "]";
    }
}
