package com.technoelivate.Abstract;

 abstract class Chakra {
	 public Chakra(int x) {
		
	}
	void m1() {
		System.out.println("Hii..!");
	}
	abstract void m2();
}

public class Sample_Abstract extends Chakra {
	public Sample_Abstract(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Sample_Abstract sample_Abstract = new Sample_Abstract(10);
		sample_Abstract.m1();
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}
}
