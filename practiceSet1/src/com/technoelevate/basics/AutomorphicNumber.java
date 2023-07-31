package com.technoelevate.basics;

public class AutomorphicNumber {
	public static void main(String[] args) {
		int no=23;
		if(check(no))
			System.out.println("It's a Automorphic number!!");
		else
			System.out.println("It's not a Automorphic number!!");
	}

	private static boolean check(int no) {
		int sqr =no*no;
		while(no!=0) {
			int rem1 =sqr%10,rem = no%10;
			if(rem1!=rem)
				return false;
			else {
				no/=10;sqr/=10;}
		}
		return true;
	}
}
