package com.technoelevate.threads;

// Any Thread runs in Background is known as Daemon Thread.
// Once the all no-daemon Thread finished their execution -
//  - daemon thread will terminate automatically.

class TestDeamon extends Thread{
	public void run() {
		for (int i =1 ; i <= 5; i++) {
			System.out.println("Daemon thread ...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class Daemon_Threads {
	public static void main(String[] args) {
		System.out.println("Main thread Starts...");
		TestDeamon mon = new TestDeamon();
		mon.setDaemon(true);
		mon.start();
		System.out.println("Main thread Ends ...");
		
	}
}
