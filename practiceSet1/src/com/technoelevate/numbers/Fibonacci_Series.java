package com.technoelevate.numbers;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int no1 = 0,no2=1,no3,limit=10;
		System.out.print(no1+" "+no2+" ");
		for (int i = 1; i <= limit-2; i++) {
			no3=no1+no2;
			System.out.print(no3+" ");
			no1=no2;
			no2=no3;
		}
	}
}
