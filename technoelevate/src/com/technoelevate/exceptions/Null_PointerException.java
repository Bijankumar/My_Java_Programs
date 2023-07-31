package com.technoelevate.exceptions;

public class Null_PointerException {
	int a =10;
	static String x;	
	public static void main(String[] args) {
		//x referenced with null value we can't perform any operation
		System.out.println(x.length());	// throws exception.
		Null_PointerException exception = null;
		System.out.println(exception.a); // throws exception.
	}
}
