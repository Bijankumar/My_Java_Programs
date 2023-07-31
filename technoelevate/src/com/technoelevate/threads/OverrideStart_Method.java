package com.technoelevate.threads;

class Samplee extends Thread {
	public void start() {
		super.start();// it will create new thread by calling super class(Thread) start method.
		System.out.println("Overriden Start method !!");
	}

	public void run() {
		System.out.println("Overriden Run method !!");
	}
}

public class OverrideStart_Method {
	public static void main(String[] args) {
		Samplee sample = new Samplee();
		sample.start(); // it will not create new thread.
	}
}
