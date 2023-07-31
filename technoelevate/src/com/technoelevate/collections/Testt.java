package com.technoelevate.collections;

public class Testt {
	synchronized static void m1() {
		System.out.println("Hii..");
		System.out.println("Hii..");
		System.out.println("Hii..");
		System.out.println("Hii..");
	}
	static void m2() {
		System.out.println("Hello....");
		System.out.println("Hello....");
		System.out.println("Hello....");
	}
	public static void main(String[] args) {
		Testt testt = new Testt();
			for (int i = 0; i < 2; i++) {
				m1();
				m2();
			}
	}
}
