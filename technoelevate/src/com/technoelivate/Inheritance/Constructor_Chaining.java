package com.technoelivate.Inheritance;

class SuperClass{
	public SuperClass() {
		System.out.println("SuperClass non-parameterized Constructor !!");
	}
	SuperClass(int value){
		System.out.println("SuperClass parameterized Constructor with !!"+value);
	}
}
class SubClass extends SuperClass{
	public SubClass() {	//it will call implicitly while creating object 
		System.out.println("SubClass non-parameterized implicit calling Constructor !!");
	}
	SubClass(int value){
		super(value);	// Explicily calling SuperClass Constructor
		System.out.println("SubClass non-parameterized Explicit calling Constructor !!");
	}
}
public class Constructor_Chaining extends SubClass {
	public static void main(String[] args) {
		SubClass subClass = new SubClass();	//implicit calling.
		
		SubClass subClass2 =new SubClass(101); // Explicit calling.
		
	}
}
