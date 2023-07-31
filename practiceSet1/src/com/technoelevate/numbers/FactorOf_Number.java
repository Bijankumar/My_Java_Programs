package com.technoelevate.numbers;

public class FactorOf_Number {
	public static void main(String[] args) {
		int no =30;
		System.out.println("The Factos of "+no+" are :");
		for (int i = 1; i <= no/2; i++) {
			if(no%i==0) System.out.print(i+" ");
		}
	}
}
