package com.technoelevate.exceptions;

public class Number_FormatException {
	static String x="abc";
	public static void main(String[] args) {
		// formating string type to number type
		int z= Integer.parseInt(x);	// throws Exception
		System.out.println(z);	
	}
}
