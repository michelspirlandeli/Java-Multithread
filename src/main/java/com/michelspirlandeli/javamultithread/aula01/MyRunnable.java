package com.michelspirlandeli.javamultithread.aula01;

/**
 * JAVA MULTITHREAD - Threads e Runnable
 * @author michel
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
