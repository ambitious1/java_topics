package com.java_topics.concurrency;

public class WaitNotify {
	
	
	private static final Object lock1 = new Object();
	
	
	public static void main(String[] args) {
		Thread one = new Thread(() -> {
			try {
				one();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread two= new Thread(() -> {
			try {
				two();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		one.start();
		two.start();
	}
	
	
	private static void one() throws InterruptedException {
		synchronized(lock1){
			System.out.println("Hello from method one....");
			lock1.wait();
			System.out.println("Back again in method one.....");
		}
	}
	
	
	private static void two() throws InterruptedException {
		synchronized(lock1){
			System.out.println("Hello from method two....");
			lock1.notify();
			System.out.println("Hello from method two after the notify.....");
		}
	}
	
	
}
