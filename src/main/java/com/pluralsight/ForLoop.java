package com.pluralsight;

import java.io.PrintStream;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int counter = 10; counter >= 1; counter-- ){
            System.out.println(counter);
            Thread.sleep(1000);
        }
        System.out.println("Launch");

    }
}
