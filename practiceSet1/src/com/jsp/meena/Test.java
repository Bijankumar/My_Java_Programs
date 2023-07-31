package com.jsp.meena;

// Example of Pass By ref.
public class Test {
	
	int x = 10; //Global/Instance/non-static variable
	
	public static void disp(Test t) {
		// to access non-static member we need object ref. inside static method.
		
		System.out.println(t.x);
	}
	public static void main(String[] args) {
	// if we want to access non-static variable we need Object
	// creating Test class object
		
		Test t1 = new Test();
		
		System.out.println(t1.x);	// accessing non-static variable
		
		// i want to access that non static variable in my static method...
		
		// since disp() method static we can call directly.
		
			disp(t1);	// here i pass my test class object to disp()
			
	}
}
