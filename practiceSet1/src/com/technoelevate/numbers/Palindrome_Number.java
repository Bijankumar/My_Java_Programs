package com.technoelevate.numbers;

public class Palindrome_Number {
	public static void main(String[] args) {
		int no = 12321,rev =0,copy = no;
		while(no!=0) {
			int rem = no%10;
			rev=rev*10+rem;
			no/=10;
		}
		if(rev==copy)
			System.out.println("It's a Palindrome Number !!");
		else 
			System.out.println("It's not a Palindrome Number !!");
	}
}
