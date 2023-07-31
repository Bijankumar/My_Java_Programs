package com.technoelevate.methodreference;

public class MyClass {
	public static void main(String[] args) {
		
		MethodInterface face = OldClass::new;
			face.myMethod();	//calling Constructor of OldClass
			
		MethodInterface face1 = OldClass::goBaby;
			face1.myMethod();	//calling Static method of OldClass
			
		OldClass class1 = new OldClass();
		MethodInterface face2 =  class1::come;
			face2.myMethod();	//calling no-static method of OldClass
			
	}
}
