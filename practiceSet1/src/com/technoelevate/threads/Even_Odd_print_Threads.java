package com.technoelevate.threads;

class EvenOdd{
	public synchronized void sam() {
		Thread thread = Thread.currentThread();
		for (int i = 0; i <= 10; i++) {
			if(i%2==0)System.out.println(thread.getName()+" "+i);
		}
	}
	public synchronized void ram() {
		Thread thread = Thread.currentThread();
		for (int i = 0; i <= 10; i++) {
			if(i%2!=0)System.out.println(thread.getName()+" "+i);
		}
	}
}

class MyTh1 extends Thread{
	EvenOdd o;
	public MyTh1(EvenOdd o) {
		this.o=o;
	}
	@Override
	public void run() {
		o.sam();
	}
}

class MyTh2 extends Thread{
	EvenOdd o;
	public MyTh2(EvenOdd o) {
		this.o=o;
	}
	@Override
	public void run() {
		o.ram();
	}
}

public class Even_Odd_print_Threads  {
	public static void main(String[] args) throws InterruptedException {
		EvenOdd o =  new EvenOdd();
		
		MyTh1 th = new MyTh1(o);
		th.setName("Thread 1");
		
		MyTh2 th1 = new MyTh2(o);
		th1.setName("Thread 2");
		
		th.start();
		th1.start();
	}
}
