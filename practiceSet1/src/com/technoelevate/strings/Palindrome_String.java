package com.technoelevate.strings;

public class Palindrome_String {
	public static void main(String[] args) {
		String str = "malayalam", rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println("It's a Palindrome !!");
		else
			System.out.println("It's not a Palindrome !!");
	}
}
