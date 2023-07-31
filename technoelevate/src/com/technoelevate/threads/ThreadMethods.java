package com.technoelevate.threads;

class JhanduBam extends Thread{
	public static void sum() {
		Thread th= Thread.currentThread();
		System.out.println(th.getName()+"--> Hii..");
	}
	public void run() {
		sum();
	}
}
public class ThreadMethods {
	public static void main(String[] args) {
		JhanduBam bam = new JhanduBam();
		bam.setName("Bam 1");
		bam.start();
		JhanduBam bam2 = new JhanduBam();
		bam2.setName("Bam 2");
		bam2.start();
	}
}
