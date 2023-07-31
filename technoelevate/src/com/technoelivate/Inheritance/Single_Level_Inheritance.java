package com.technoelivate.Inheritance;

class Demo{
	static int a =20,b = 10;
}

public class Single_Level_Inheritance extends Demo {
	public static void main(String[] args) {
		
// a and b are the properties of parent class
// Sample_Inheritance as child of demo class we can access all the properties
		
		System.out.println(" Sum : "+(a+b)+"\n Substraction : "+(a-b));
	}
}
