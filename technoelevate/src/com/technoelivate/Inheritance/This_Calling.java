package com.technoelivate.Inheritance;

public class This_Calling {
	public This_Calling(char a) {
		this("Bijan");
		System.out.println(a);
	//	this("Bijan");	// We can't becuase
	//	Constructor call must be the first statement in a constructor
	}
	public This_Calling(double p) {
		System.out.println(p);
	}
	public This_Calling(int a ) {
		this(20.5);
	//	this(45); // We can't develope two this calling Statement in one Constructor
		System.out.println(a);
	}
	public This_Calling(String a) {
		this(45);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		 new This_Calling('B');
		
	}
}
