package com.technoelivate.Abstract;

final class Techno {

}

//class Elevate extends Techno{ 
//	The type Elevate cannot subclass the final class Techno
class Elevate {
	final double pi = 3.14;

	Elevate(double x) {
		// pi = x; //The final field Elevate.pi cannot be assigned
	}

	final void paySalary() {

	}
}

class Employee extends Elevate {
	Employee(double x) {
		super(x);
	}

//	 final void paySalary() { 
	// Cannot override the final method from Elevate
	int sal = 101;
//	 }
}

public class Final_Modifire {
	public static void main(String[] args) {
		Employee employee = new Employee(3.142);
	}
}
