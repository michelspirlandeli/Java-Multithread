package com.michelspirlandeli.javamultithread.aula01;

/**
 * JAVA MULTITHREAD - Threads e Runnable
 * @author michel
 */
public class Threads_0 {

    public static void main(String[] args) {
        // Verificar Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        //Criar nova thread
        Thread t1 = new Thread(new MyRunnable());
        // t1.run(); apenas executando na mesma thread
        t1.start(); // executando em uma nova thread

        // Runnable como lambda
        Thread t2 = new Thread( () -> System.out.println("Hello World"));
        t2.start();
        // t2.start(); não chame o start() mais de uma vez na mesma Thread, vai lançar uma exceção

        //Várias thread
        Thread t3 = new Thread(new MyRunnable());
        t3.start();// Posso usar Runnable varias vezes

    }
}
