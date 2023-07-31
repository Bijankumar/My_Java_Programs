package com.technoelevate.threads;

class Child extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + ".Hii !!");
		}
	}
}

public class MainThread_Wait_ForChild_Thread {
	public static void main(String[] args) throws InterruptedException {
		Child child = new Child();
		child.start();
		child.join();
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ".Hello !!");
			Thread.sleep(500);
		}
	}
}
