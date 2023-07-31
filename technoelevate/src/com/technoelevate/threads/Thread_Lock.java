package com.technoelevate.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread{		
	public static Lock lock = new ReentrantLock();//lock should be static.
	
	public void run() {
		Thread th= Thread.currentThread();
		lock.lock();
		try {
			System.out.println(th.getName()+": Starts the Job !!");
			Thread.sleep(2000);
			System.out.println(th.getName()+": Ends the Job !!");
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Thread_Lock {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
			myThread.setName("Thread 1");
		
		MyThread myThread2 = new MyThread();
			myThread2.setName("Thread 2");
			
			MyThread myThread3 = new MyThread();
			myThread3.setName("Thread 3");
			
			
			myThread3.start();
			myThread.start();
			myThread2.start();
	}
}
