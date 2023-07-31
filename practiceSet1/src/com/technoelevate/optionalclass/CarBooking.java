package com.technoelevate.optionalclass;

import java.util.*;

public class CarBooking {
	static String car= "Car Booked";
	static int count =3;
	public static Optional getCar() {
		count--;
		if(count>=0) 
			return Optional.ofNullable(car);
		else {
			car=null;
			return Optional.ofNullable(car);
		}
	}
	public static void main(String[] args) {
		System.out.println(getCar().orElse("Out of stock"));
		System.out.println(getCar().orElse("Out of stock"));
		System.out.println(getCar().orElse("Out of stock"));
		System.out.println(getCar().orElse("Out of stock"));
		System.out.println(getCar().orElse("Out of stock"));
	}
}
