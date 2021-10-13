package org.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {

    public static void main(String[] args) {
        System.out.println("Main thread starts here...");

        ExecutorService executor = Executors.newCachedThreadPool();
        // Using newFixedThreadPool
//        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.execute(new LoopTasks());
        }

        executor.shutdown();
        System.out.println("Main thread ends here...");
    }
}

class LoopTasks implements Runnable {

    public static int count = 0;
    private int id;

    public LoopTasks() {
        count = count + 1;
        id = count;
    }

    @Override
    public void run() {

        System.out.println("******* <Task - " + id + " >Started *******");


        for ( int i = 0; i < 1000; i++) {
            System.out.println(">" +id + " Val " + i);

            try {
                TimeUnit.MILLISECONDS.sleep((long)Math.random() * 1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
        System.out.println("******* <Task - " + id + " >Completed *******");
    }
}