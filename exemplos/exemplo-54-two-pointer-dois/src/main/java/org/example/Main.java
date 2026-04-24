package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.findMiddle();
    }
}