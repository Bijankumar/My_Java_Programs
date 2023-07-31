package com.technoelevate.threads;

class Sample {
//	interface Bijan{
//		void run();
//	}
	synchronized void sum(int n)
	{
		// Creating a thread instance
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(
				t.getName() + " : " + (n + i));
		}
	}
}

class Demo extends Thread {

	// Creating an object of class Sample
	Sample sample = new Sample();
	public void run()
	{
		// Calling sum() method
		sample.sum(10);
	}
}
 public class ThreadClass {
	public static void main(String[] args)
	{

		// Creating an object of class Demo
		Demo demo = new Demo();

		// Initializing instance t1 of Thread
		// class with object of class Demo
		Thread t1 = new Thread(demo);

		// Initializing instance t2 of Thread
		// class with object of class Demo
		Thread t2 = new Thread(demo);

		// Initializing thread t1 with name
		//'Thread A'
		t1.setName("Thread A");

		// Initializing thread t2 with name
		//'Thread B'
		t2.setName("Thread B");

		// Starting thread instance t1 and t2
		t1.start();
		t2.start();
	}
}
