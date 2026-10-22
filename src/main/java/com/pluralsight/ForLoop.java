package com.pluralsight;

import java.io.PrintStream;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int counter = 10;
        for (int i = counter; i >= 1; i-- ){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch");

    }
}
