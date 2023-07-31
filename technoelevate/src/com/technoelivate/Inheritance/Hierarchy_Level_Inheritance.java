package com.technoelivate.Inheritance;

class Demoo{
	// Parent class
	static int a =20,b = 10;
}
class Memoo extends Demo {
	// Child of ' Demo ' Class
	static int rem =a%b, div = a/b;
	public static void hello() {
		System.out.println(" Division : "+div+"\n Reminder : "+rem);
	}
}
public class Hierarchy_Level_Inheritance extends Demo {
	// Child of ' Demo ' class 
	public static void main(String[] args) {
		Memoo.hello();
	System.out.println(" Sum : "+(a+b)+"\n Substraction : "+(a-b));
	}
}

