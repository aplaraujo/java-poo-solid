package org.example;

public class LinkedListMiddle {
    Node head;

    public Node getHead() {
        return head;
    }

    void findMiddle() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        while ((fastPointer != null) && (fastPointer.next != null)) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        System.out.println("Middle element is: " + slowPointer.data);
    }
}
