package com.java_topics.concurrency;

import java.util.concurrent.*;;

public class ExecutorServiceExample {
	private static final ExecutorService executor = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int transactionId = i;
            executor.submit(() -> processTransaction(transactionId));
        }
        executor.shutdown();
    }

    private static void processTransaction(int id) {
        System.out.println("Processing transaction " + id + " by " + Thread.currentThread().getName());
    }
}
