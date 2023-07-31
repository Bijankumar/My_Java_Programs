package com.technoelevate.exceptions;

public class Checked_Exception {
	 String str;
	 public Checked_Exception(int x) {
//		str=x;
	}
	public static void main(String[] args) {
		Checked_Exception checked_Exception = new  Checked_Exception(5);
		System.out.println(checked_Exception.str);
			
	}
}
