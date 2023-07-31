package com.technoelevate.basics;

public class String_Patterns {
	public static void main(String[] args) {
		String str = "Bijan";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}
