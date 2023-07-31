package com.technoelevate.threads;

class S_Child extends Thread {
	static Thread wait;

	public void run() {
		try {
			wait.join();	// Child thread will be wait for Main thread to be Complete.
		} catch (InterruptedException e) {
		}
		for (int i = 1; i <= 5; i++) {	
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {}
			
			System.out.println("Welcome : " + i);
		}
	}
}

public class ChildThread_WaitFor_MainThread {
	
	public static void main(String[] args) throws InterruptedException {

		S_Child.wait = Thread.currentThread();
		S_Child child = new S_Child();
		
		child.start(); // child thread stated

		// If Both the Thread will wait for another thread to be complete
		// It will be like Dead Lock Situation.

//		child.join(); // Main thread will be wait for Child thread to be Complete.

		for (int i = 6; i <= 10; i++) {
			Thread.sleep(1000);
			System.out.println("Hii Hello..!!");
		}
	}
}
