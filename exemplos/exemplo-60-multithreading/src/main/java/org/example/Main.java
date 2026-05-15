package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        * Multithreading
        * - Enables a program to run multiple threads concurrently
        * - Thread: a set of instructions that run independently
        * - It is useful for background tasks or time-consuming operations
        * */

        Thread thread1 = new Thread(new MyRunnable("PING!"));
        Thread thread2 = new Thread(new MyRunnable("PONG!"));

        System.out.println("GAME START!");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.out.println("GAME OVER!");
    }
}