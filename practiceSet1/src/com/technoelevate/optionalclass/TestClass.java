package com.technoelevate.optionalclass;

import java.util.Optional;

public class TestClass {
	static int count=5;
	static String obj = "Booked";
	public static Optional<Object> getObject() {
		count--;
		if(count==0) {
			obj=null;
			return Optional.ofNullable(obj);
		}
		else 
			return Optional.ofNullable(obj);
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 8; i++) {
			System.out.println(getObject().orElse("It's not Available"));
		}
	}
}
