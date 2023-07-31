package com.technoelivate.Abstract;

interface Sam{
	default void sample() {
		int a = 10;
		System.out.println("Hii..");
	}
}
abstract class Sample implements Sam{
	int x;

	public Sample() {
		x = 35;
	}

	abstract void hello();
}

class Impliment extends Sample {
	@Override
	void hello() {

	}
}

public class Abstarct_Class implements Sam{

	public static void main(String[] args) {


	}
}
