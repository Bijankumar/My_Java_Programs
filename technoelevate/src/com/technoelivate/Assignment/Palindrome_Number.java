package com.technoelivate.Assignment;
//	Palindrome Number (121)
public class Palindrome_Number {
	public static void main(String[] args) {
		int no = 121,rev=0,copy=no;
		while(no!=0) {
			int rem=no%10;
			rev=rev*10+rem;
			no/=10;
		}
		if(copy==rev)
			System.out.println(copy+" is a Palindrome Number !!");
		else
			System.out.println(copy+" is not a Palindrome Number!!");
	}
}
