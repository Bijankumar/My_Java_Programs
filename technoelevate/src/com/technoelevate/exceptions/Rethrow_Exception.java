package com.technoelevate.exceptions;

public class Rethrow_Exception {
	public static void main(String[] args) {
		try {
			doWork();
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void doWork() throws CustomException {
		try {
			throw new CustomException("An error Occured");
		}catch(CustomException e){
			throw e;
		}
	}
}
class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
}