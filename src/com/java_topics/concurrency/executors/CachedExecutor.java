package com.java_topics.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedExecutor {
	public static void main(String[] args) {
		try (ExecutorService service = Executors.newCachedThreadPool()) {
			for(int i=0; i< 1000; i++) {
				service.execute(new TaskOne(i));
			}
		}
	}
}

class TaskOne implements Runnable {
	private final int taskId;
	
	TaskOne(int taskId){
		this.taskId = taskId;
	}
	
	@Override
	public void run() {
		System.out.println("Task: " + taskId + " being executed by " + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}