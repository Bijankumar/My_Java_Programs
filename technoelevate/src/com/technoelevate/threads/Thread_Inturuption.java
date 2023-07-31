package com.technoelevate.threads;

public class Thread_Inturuption {
	public static void main(String[] args) {
		Demo demo = new Demo();
		Thread th1 = new Thread(demo);
			th1.start();
		Thread th2 = new Thread(demo);
			th2.start();
			
	}
}
