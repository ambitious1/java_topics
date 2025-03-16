package com.java_topics.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		ExecutorService service = Executors.newSingleThreadExecutor()) {
			for(int i = 0; i< 5; i++) {
				service.execute(new Task(i));
			}
		}
	}
}

class Task implements Runnable{
	private final int taskId;
	
	
	public Task(int taskId) {
		this.taskId = taskId;
	}
	
	
	@Override
	public void run() {
		System.out.println("Task with ID " + taskId + " being executdd by Thread " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
