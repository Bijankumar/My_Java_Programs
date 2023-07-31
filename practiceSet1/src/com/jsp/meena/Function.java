package com.jsp.meena;

// Write a program in function by passing ref. and value
// Perfect no. : 6, 28, 496, 8128.

public class Function {
	
	static void check(Function f,int no) {
		if(f.isPerfectno(no))
			System.out.println("It is a Perfect Number!!");
		else 
			System.out.println("It is not a Perfect Number !!");
	}
	
	boolean isPerfectno(int no) {
		int sum=0;
		for (int i = 1; i <= no/2; i++) {
			if(no%i==0)sum+=i;
		}
		if(sum==no)return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Function f = new Function();
		int no = 6;
		// pass by reference & value
		check(f,no);
	}
}
