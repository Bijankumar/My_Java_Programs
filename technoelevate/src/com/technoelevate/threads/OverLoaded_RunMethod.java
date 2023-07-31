package com.technoelevate.threads;

class ThreadClasss extends Thread {

	public void run() {
		System.out.println("no-args Run Method!!");
	}

	public void run(int x) {
		System.out.println("int-args Run Method!!");
	}
}

public class OverLoaded_RunMethod {
	public static void main(String[] args) {
		ThreadClasss class1 = new ThreadClasss();
		class1.start();
		class1.run(5);
	}
}
