package com.technoelivate.Inheritance;

class Sample{
	int a =10;
	public Sample(int b) {
		a=b;
		System.out.println(a);
	}
}

class Demo1 extends Sample{
	int b;
	public Demo1(int c) {
		super(c);
		b=c;
		System.out.println(b);
	}
}

class Memo1 extends Demo1{
	public Memo1(int c) {
		super(c);
		System.out.println(c);
	}	
}
public class Super_Calling {
	public static void main(String[] args) {
		Memo1 memo = new Memo1(5);
	}
}
