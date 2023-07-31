package com.technoelivate.Assignment;

//	Find the remainder without using % operator
//	Find out the sum without using + operator
//	Find out sub without � Operator
//	Multiply without using * operator

public class Operation_Without_Operator {
	public static void main(String[] args) {
		
//		int a =5,b=7;
//		for(int i =0;i<b;i++) {
//			a++;
//		}
//		System.out.println(a);
//		System.out.println(~4);
		add(4,5);
		sum(5,4);
		mul(5,4);
		div(10,2);
		division(10,5);
		sub(10,5);
	}

	private static void sub(int i, int j) {
		
	}

	private static void division(int i, int j) {
		int quotient = 0;
		while(i >= j) {
			i -= j;
			quotient++;
		}
		System.out.println(quotient);
	}

	private static void div(int i, int j) {	// Without using '/'
		int sign =1;
		
		if((i>0&&j<0)||(i<0&&j>0))sign = -1;
			
		i=Math.abs(i); // if value is negative it will return it's negation value 
		j=Math.abs(j);	
//		System.out.println(i);
//		System.out.println(j);
		
		int quotient = 0;
		while(i >= j) {
			i -= j;
			quotient++;
		}
		System.out.println(sign * quotient);
	}

	private static void sum(int i, int j) { // Without using '+'
		System.out.println(i-(-j));	
	}

	private static void add(int i, int j) {	// Without using Any Arithmetic operator
		while(j!=0) {
			int carry = i&j;
			i= i^j;
			j=carry<<1;
		}
		System.out.println(i);
	}
	
	public static void mul(int no1,int no2) { // Without using '*'
		int mul=0;
		for (int i = 1; i <= no1; i++) {
			mul+=no2;
		}
		System.out.println(mul);
	}
	
	
	
//	public static int quotientOfNumber(int num, int divisor) {
//		int rem = num%divisor;
//		int quo = (num-rem)
//	}
}
