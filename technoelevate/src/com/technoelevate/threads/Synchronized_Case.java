package com.technoelevate.threads;

class Display {
	public static synchronized void wish(String name) {
		for (int i = 0; i <= 5; i++) {
			System.out.print("Good Morning...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println(name);
		}
	}
}
class MyThreads extends Thread{
	Display d;
	String name;
	public MyThreads(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class Synchronized_Case {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
/*
 * if multiple threads wants execute same task through different objects then
 * even though method is synchronized we will get irregular output. because
 * Synchronized keyword apply locks in object level so if there is two objects
 * lock will be new for every objects.

 if Synchronized method will static even though threads are access 
 through different objects we will get regular out put.
 
 Any method is declare with static synchronized keyword
 then the method is known as the method has class level lock .
*/		
		MyThreads my = new MyThreads(d1, "Bijan");
		MyThreads my2 = new MyThreads(d2, "Chakra");
		
		my.start();
		my2.start();
	}
}
