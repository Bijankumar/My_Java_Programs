package com.technoelevate.numbers;

public class Factorial_Number {
	public static void main(String[] args) {
		int no = 5,fact=1;
		for (int i = no; i >=1; i--) {
			fact*=i;
		}
		System.out.println(fact);
	}
}
