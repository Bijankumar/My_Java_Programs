package com.technoelevate.basics;

public class Piramid_String_Patterns {
	public static void main(String[] args) {
		String str = "Bijan";
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length()-1; j >= 0 ; j--) {
				if(i>=j)
					System.out.print(str.charAt(j)+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
