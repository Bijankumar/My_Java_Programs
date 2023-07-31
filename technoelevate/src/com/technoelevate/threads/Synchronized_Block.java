package com.technoelevate.threads;

class MyDisplay{
	public void wish(String name) throws InterruptedException {
		Thread t = Thread.currentThread();
		;;;;;;//1 lack lines of code
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName()+" Hii... : "+i);
			Thread.sleep(1000);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName()+" Hello... : "+i);
			Thread.sleep(1000);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName()+" Byy... : "+i);
			Thread.sleep(1000);
		}
		synchronized (this) {
			
		for (int i = 0; i <= 5; i++) {
			System.out.print(t.getName()+" Good Morning...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println(name);
		}	
	}
		;;;;;;//1 lack lines of code
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName()+" Oey... : "+i);
			Thread.sleep(1000);
		}
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(t.getName()+" Chal... : "+i);
//			Thread.sleep(1000);
//		}
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(t.getName()+" Ja be..  : "+i);
//			Thread.sleep(1000);
//		}
	}
}
class ThisThread extends Thread{
	MyDisplay d;
	String name;
	
	public ThisThread(MyDisplay d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {}
	}
}
public class Synchronized_Block {
	public static void main(String[] args) {
		MyDisplay display = new MyDisplay();
		
		ThisThread th1 = new ThisThread(display, "Bijan");
		th1.setName("Thread 1");
		ThisThread th2 = new ThisThread(display, "Chakra");
		th2.setName("Thread 2");
		ThisThread th3 = new ThisThread(display, "Ram");
		th3.setName("Thread 3");
		
		th1.start();
		th2.start();
		th3.start();
	}
	
}
