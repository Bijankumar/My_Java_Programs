package com.jsp.meena;

// print `n` Fibonacci Numbers..

public class Fibonacci_Numbers {
	public static void main(String[] args) {
		int no1=0,no2=1,no3,count=1;
		System.out.println(no1+" \n"+no2);
		
		int n=10; // Declare nth value 
		
		while(count<=n-2) {
			System.out.println(no3=no1+no2);
			no1=no2;
			no2=no3;
			count++;
		}
	}
}
