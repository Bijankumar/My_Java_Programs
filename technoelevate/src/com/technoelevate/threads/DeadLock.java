package com.technoelevate.threads;

class A {
	public synchronized void m1(B b) {
		System.out.println("Starts Execution of m1()...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("Calling B of last()...");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Starts Execution Of A of last() ...");
	}
}

class B {
	public synchronized void m2(A a) {
		System.out.println("Starts Execution of m2()...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("Calling A of last()...");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Starts Execution Of A of last() ...");
	}
}

public class DeadLock extends Thread {
	A a = new A();
	B b = new B();

	public void child() {
		this.start();
		a.m1(b); // Execute by main thread..
	}

	public void run() {
		b.m2(a); // Execute by Child Thread..
	}

	public static void main(String[] args) {
		DeadLock lock = new DeadLock();
		lock.child();
	}
}
