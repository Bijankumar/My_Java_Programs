package com.technoelevate.threads;

class ThreadA extends Thread {
	int total;

	public void run() {
		System.out.println("Child thread strats claculation...");
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total += i;
			}
			System.out.println("Child thread sending notification...");
			this.notify();
		}
	}
}

public class Thread_Communication {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.start();
		synchronized (a) {
			try {
				System.out.println("Main thread going waiting state !!");
				a.wait();
			} catch (InterruptedException e) {}
			
			System.out.println("Main thread get notified..by child thread..");
			System.out.println(a.total);
		}
	}
}
