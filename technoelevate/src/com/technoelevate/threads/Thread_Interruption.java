package com.technoelevate.threads;

// A Thread can interrupt a sleeping/waiting thread by using interrupt().

// If the target thread never enter in to sleeping or waiting state 
// in it's life time then the interrupt call will be wasted.

class LazyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Working..!!");
			System.out.println("Going to sleep State ..");
			try {
				System.out.println("Slept...!");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("I got Interrupted..!!");
			}
		}
	}
}

public class Thread_Interruption {
	public static void main(String[] args) {
		LazyThread th1 = new LazyThread();
		th1.start();
		th1.interrupt();
		System.out.println("Work Done..");
	}
}
