package com.technoelivate.Abstract;

interface Samplee{
	void sam();
}
interface Demo{
	void dem();
}
class MyClass implements Demo, Samplee{

	@Override
	public void sam() {
		System.out.println("This is Sample Interface");
	}

	@Override
	public void dem() {
		System.out.println("This is Demo Interface");
	}
	
}
public class Multiple_Inheritance {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.sam();
		myClass.dem();
	}
}
