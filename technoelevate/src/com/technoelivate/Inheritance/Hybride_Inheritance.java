package com.technoelivate.Inheritance;

class GrandFather{
	// Parent class
	static int a =20,b = 10;
}
class Father extends GrandFather {
	// Child of GrandFather Class
	static int rem =a%b, div = a/b;
}
public class Hybride_Inheritance extends Father {
	// Child of Father class and Grand Child of GrandFather Class
	public static void main(String[] args) {
		System.out.println(" Sum : "+(a+b)+"\n Substraction : "+(a-b));

		System.out.println(" Division : "+div+"\n Reminder : "+rem);
		
		Uncle.hello();
		}
	}

class Uncle extends GrandFather {
		// Child of GrandFather class 
		public static void hello() {
		System.out.println(" Sum : "+(a+b)+"\n Substraction : "+(a-b));
		}
	}

