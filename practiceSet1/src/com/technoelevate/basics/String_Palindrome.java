package com.technoelevate.basics;

import java.util.Scanner;

public class String_Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String Here : ");
		String str = scanner.next().toLowerCase(),rev="";
		for (int i = str.length()-1; i >= 0; i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("It's a Palindrome !!");
		else
			System.out.println("It's not a Palindrome !!");
	}
}