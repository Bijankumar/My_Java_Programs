package com.technoelevate.threads;

class TestClass implements Runnable{
	synchronized public void run() {
		Thread thread = Thread.currentThread();
		try {	
			System.out.println(thread.getName()+":: Starts the Job..!!");
			Thread.sleep(5000); // Doing Some Work
			System.out.println(thread.getName()+":: Ends the Job..!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Synchronization_Block extends Thread {
	public static void main(String[] args) {
		TestClass class1 = new TestClass();
		Thread thread1 = new Thread(class1);
			thread1.setName("Thread 1");
		Thread thread2 = new Thread(class1);
			thread2.setName("Thread 2");	
		
		thread1.start();
		thread2.start();	
	}
}
