package com.technoelevate.exceptions;
	
public class Illegal_ArgumentsException {
	String x;
	public Illegal_ArgumentsException(String y) {
		x=y;
	}
	public static void main(String[] args) {
		//new Illegal_ArgumentsException(5);//throws exception.
	}
}
