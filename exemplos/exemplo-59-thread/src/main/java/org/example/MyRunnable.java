package org.example;

public class MyRunnable implements Runnable{
    // Code that will be executed in a background
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted!");
            }

            if (i == 5) {
                System.out.println("Time is up!");
                System.exit(0); // Ends the program prematurely
            }
        }
    }
}
