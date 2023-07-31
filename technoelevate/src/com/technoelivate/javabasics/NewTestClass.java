package com.technoelivate.javabasics;

// we can write super class after sub class...

public class NewTestClass  extends Dog{
	public static void main(String[] args) {
		sam();
	}
}

class Dog{
	public static void sam() {
		System.out.println("Hii... from Superclass..");
	}
}
