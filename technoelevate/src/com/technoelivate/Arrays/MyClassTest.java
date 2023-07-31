package com.technoelivate.Arrays;

public class MyClassTest {
	public static void main(String[] args) {
		
		MyClass.a=23;
		System.out.println(MyClass.a);
		
		MyClass myClass = new MyClass(34); 
		System.out.println(myClass.b);
		
		myClass.m();
	}

}
