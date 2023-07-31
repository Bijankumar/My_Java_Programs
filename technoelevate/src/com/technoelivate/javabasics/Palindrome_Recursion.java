package com.technoelivate.javabasics;

public class Palindrome_Recursion {
	public static void main(String[] args) {
		int no = 123454321;
		if(no==reverse(no))
			System.out.println("It's a Plaindrome !!");
		else
			System.out.println("It's not a Palindrome !!");
	}
	private static int reverse(int no) {
		int rev=0;
		if(no!=0) {
			int rem= no%10;
			rev=rev*10+rem;
			no/=10;
			reverse(no);
		}	
		return rev;	
	}
}
