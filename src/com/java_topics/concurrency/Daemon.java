package com.java_topics.concurrency;


//once any user thread 

public class Daemon {
	public static void main(String[] args) {
		Thread bgThread = new Thread(new DaemonHelper());
		Thread usrThread = new Thread(new UserThreadHelper());
		
		bgThread.setDaemon(true);
		bgThread.start();
		usrThread.start();
	}
}

class DaemonHelper implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		while(count<500) {
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			count++;
			System.out.println("Daemon helper running....");
		}
	}
	
}

class UserThreadHelper implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("User thread done with execution .....");
	}
	
}