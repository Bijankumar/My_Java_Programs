package com.technoelevate.designpatterns;

public class CarWorld {
	public static Cars newCar(String type) {
		if(type.equalsIgnoreCase("BMW"))return new Bmw();
		else if(type.equalsIgnoreCase("Scoda"))return new Scoda();
		else if (type.equalsIgnoreCase("Marsidies")) return new Mersidies();
		else return null;
	}
}
