package com.technoelivate.Assignment;
// Factorial without using loop
public class Factorial_Without_Loop {
	static int no = 5,fact=1;
	public static void main(String[] args) {
		factorial(no);
		System.out.println(faco(no));
		System.out.println(facoo(no));
	}

	private static int faco(int no2) {
		if(no2==1)return 1;
		else return (no2*faco(no2-1));
	}
	
	private static int facoo(int no2) {
		if(no2==0)return 1;
		else return (no2*faco(no2-1));
	}

	private static void factorial(int no) {
		if(no!=0) {
		fact*=no;
		factorial(no-1);
		}else
		System.out.println(fact);
	}
}
