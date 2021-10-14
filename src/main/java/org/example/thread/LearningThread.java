package org.example.thread;

public class LearningThread {

    public void runProcess() {
        Thread th = new Thread(new Runnable () {

            @Override
            public void run () {

            }
        });
    }

    /**
     * Different ways of naming a thread Using
     * 1. intantiation
     * 2. setName
     * @param args
     */
    public static void main(String[] args) {
        Thread th = new Thread(new SomeTask(), "someTask1");
        th.setName("changeOfName");
        th.start();
    }

}

class SomeTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
