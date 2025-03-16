package com.java_topics.concurrency.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new ProbeTask(), 1000, 2000, TimeUnit.MILLISECONDS);
		
		try {
			if(!service.awaitTermination(10000, TimeUnit.MILLISECONDS)) {
				service.shutdownNow();
			} 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			service.shutdownNow();
		}
	}
}

class ProbeTask implements Runnable{
	@Override
	public void run() {
		System.out.println("Probing endpoint for updates....");
	}
}