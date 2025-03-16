package com.java_topics.concurrency;

public class Synchronization {
	private static int counter = 0;
	private static int counter2 = 0;
	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();
	
	
	public static void main(String[] args) {
		Thread one = new Thread(() -> {
			for(int i = 0; i< 10000; i++) {
				//counter++;
				increment1();
			}
		});
		
		
		Thread two = new Thread(() -> {
			for(int i = 0; i< 12000; i++) {
				//counter2++;
				increment2();
			}
		});
		
		one.start();
		two.start();
		
		try {
			one.join();
			two.join();
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("Counter1 value: " + counter + " ----- Counter2 value: " + counter2);
	}
	
	private static void increment1() {
		synchronized(lock1) {
			counter++;
		}
	}
	
	private static void increment2() {
		synchronized(lock2) {
			counter2++;
		}
	}
	
}
