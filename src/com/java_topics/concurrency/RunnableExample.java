package com.java_topics.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount a = new BankAccount(1005);
		BankAccount b = new BankAccount(10600);
		
		Thread customer1 = new Thread(new Person("Mickey", a));
		Thread customer2 = new Thread(new Person("Travis", b));
		
		customer1.start();
		customer2.start();
		
		a.deposit(222);
		b.withdraw(320);
		a.withdraw(900);
		b.deposit(500);
	}

}

//Create a simple Java program that simulates two customers accessing their accounts simultaneously using threads.
class BankAccount {
	private double accountBalance;
	private Lock lock = new ReentrantLock();
	
	public BankAccount(int total) 
	{
		this.accountBalance = total;
	}
	
	public void deposit(double amount) {
		lock.lock();
		
		try {
			System.out.println("Starting balance " + accountBalance);
			accountBalance += amount;
			
			System.out.println("Thread (" + Thread.currentThread().getName() + ") deposit: $ " + amount);
			System.out.println("New Balance After Deposit: $" + accountBalance);
		}finally {
			lock.unlock();
		}
	}
	
	public void withdraw(double amount) {
		lock.lock();
		try {
			System.out.println("Starting balance " + accountBalance);
			accountBalance-=amount;
			System.out.println("Thread (" + Thread.currentThread().getName() + ") withdrew: $ " + amount);
			System.out.println("New Balance After Withdraw: $" + accountBalance);
		}finally {
			lock.unlock();
		}
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
}


class Person implements Runnable{
	
	private String customerName;
	private BankAccount account;
	
	public Person(String l, BankAccount account) {
		this.customerName = l;
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My name is: " + customerName + " and threadId: " + Thread.currentThread().getName() + " and startingAccountBalance: " + account.getAccountBalance());
	}
}