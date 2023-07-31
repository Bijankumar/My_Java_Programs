package com.technoelevate.threads;

class Displayy{
	public synchronized void num() {
		Thread t = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(t.getName()+": "+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {};
		}
	}
	
	public synchronized void charc() {
		Thread t2 = Thread.currentThread();
		for (int i = 65; i < 75; i++) {
			System.out.println(t2.getName()+": "+(char)i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {};
		}
	}
}

class Mythread1 extends Thread{
	Displayy d;

	public Mythread1(Displayy d) {
		this.d = d;
	}
	public void run() {
		d.num();
	}
}
class Mythread2 extends Thread{
	Displayy d;
	
	public Mythread2(Displayy d) {
		this.d = d;
	}
	public void run() {
		d.charc();
	}
}

public class Object_level_Lock {
	public static void main(String[] args) {
		Displayy d = new Displayy();
		Mythread1 my1 = new Mythread1(d);
		my1.setName("my1");
		Mythread2 my2 = new Mythread2(d);
		my2.setName("my2");
		
		my1.start();
		my2.start();
	}
}
