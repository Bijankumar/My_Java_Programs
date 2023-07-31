package com.technoelevate.threads;

class Numbers implements Runnable {
	@Override
	public synchronized void run() {
		Thread th = Thread.currentThread();
		if (th.getName().equals("Thread 1")) {
			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 0)
					System.out.println(th.getName() + " " + i);
			}
		} else {
			for (int i = 0; i <= 10; i++) {
				if (i % 2 != 0)
					System.out.println(th.getName() + " " + i);
			}
		}
	}
}

public class Even_OddThreads extends Thread {
	public static void main(String[] args) {
		Numbers n = new Numbers();
		
		Thread th = new Thread(n);
		th.setName("Thread 1");

		Thread th1 = new Thread(n);
		th1.setName("Thread 2");

		th.start();
		th1.start();
	}
}
