package com.technoelevate.threads;

// yield method use to pause current executing thread to give the chance for waiting thread for same priority.
// if there is waiting thread or all waiting threads have low priority then same thread can continue it's execution.
// if multiple threads are waiting with same priority then which waiting thread will get the chance we can't except it depends on thread scheduler.
// During the time of execution if we call yield method the thread will go to ready/runnable state.
// Some platform won't support properly to yield method.

class TestYield extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread...");
			Thread.yield();
		}
	}
}


public class Test_YieldMethod {
	public static void main(String[] args) {
		TestYield yield = new TestYield();
		yield.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread...");
		}
	}
}
