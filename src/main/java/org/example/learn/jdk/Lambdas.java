package org.example.learn.jdk;

import java.io.File;

public class Lambdas {


    public void createRunnable() {
    }



    public static void main(String[] args) {
        /**
         * Runnable Example J 1.0
         *
         */
        new Thread(() -> System.out.println("Hello World")).start();

        /**
         * File Writer Example J 1.0
         * @param args
         */

        File directory = new File("./src/main");

        String[] strings = directory.list((dir, name) -> name.endsWith(".java"));
        System.out.println(strings);

    }
}
