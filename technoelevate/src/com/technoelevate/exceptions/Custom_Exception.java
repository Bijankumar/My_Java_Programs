package com.technoelevate.exceptions;

public class Custom_Exception {
	public static void main(String[] args) {
		try {
			sadiDotCom(25);
		} catch (MarriageException e) {

			System.out.println(e.getMsg());
		}
	}

	private static void sadiDotCom(int age) throws MarriageException {

		if (age > 25)
			System.out.println("Welcome to Saddi.com!!");
		else
			throw new MarriageException("Invalid Age");

	}
}

class MarriageException extends Exception {
	static String msg;

	public MarriageException(String string) {
		msg = string;
	}

	static String getMsg() {
		return msg;
	}
}