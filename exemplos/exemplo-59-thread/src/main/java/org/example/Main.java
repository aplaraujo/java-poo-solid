package org.example;

import java.util.Scanner;
// Main thread
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("You have 5 seconds to enter your name!");
        System.out.println("======================================");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Hello " + name + "!");

        sc.close();
    }
}