package com.technoelevate.threads;

class MyClassExc implements Runnable{

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println(thread.getName()+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}
	}
	
}

public class ThreadIntruption {
	public static void main(String[] args) {
		MyClassExc exc = new MyClassExc();
		
		Thread th = new Thread(exc);
		th.setName("Thread 1");
		
		Thread th1 = new Thread(exc);
		th1.setName("Thread 2");
		
		th.start();
		th.interrupt();
		th1.start();
		
		
	}
}
