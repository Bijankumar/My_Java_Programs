package com.technoelevate.lamdaexpression;

public class ImplementClass implements MyInterface {
	
	@Override
	public void sum(int a, int b) {
		System.out.println("From Implemet class : Sum is : " + (a + b));
	}
}
