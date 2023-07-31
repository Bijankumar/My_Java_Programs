package com.technoelevate.numbers;

public class Neon_Number {
	public static void main(String[] args) {
		int no = 9;
		if(neonNumber(no))
			System.out.println("It's a Neon Number !!");
		else
			System.out.println("It's not a Neon Number !!");
	}

	private static boolean neonNumber(int no) {
		int sqr = no*no,sum=0;
		while(sqr!=0) {
			int rem =sqr%10;
			sum+=rem;
			sqr/=10;
		}
		if(sum==no)return true;
		else return false;
	}
}
