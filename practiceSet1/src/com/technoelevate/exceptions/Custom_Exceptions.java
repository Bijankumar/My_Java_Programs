package com.technoelevate.exceptions;

import java.util.Scanner;

public class Custom_Exceptions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Password !!");
		String psw = scanner.next();
		try {
			submit(psw);
		} catch (InvalidPasswdException e) {
			System.out.println(e.getMessage());
		} catch (VowelFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void submit(String psw) throws VowelFoundException, InvalidPasswdException {
		int count = 0;
		if (psw.length() >= 8) {
			for (int i = 0; i < psw.length(); i++) {
				char ch = psw.charAt(i);
				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
					count++;
			}
			if (count == 0) {
				System.out.println("Logged in Sucessfully !!");
			} else {
				throw new VowelFoundException("Vowels not allowed !!");
			}
		} else {
			throw new InvalidPasswdException("Passwd shouldn't be less than 8 !! ");
		}
	}
}

class VowelFoundException extends Exception {

	public VowelFoundException(String message) {
		super(message);
	}
}

class InvalidPasswdException extends Exception {

	public InvalidPasswdException(String message) {
		super(message) ;
	}	
}

