package com.technoelevate.strings;

public class Reverse_Without_Loop {
	public static void main(String[] args) {
		String str = "Chakra";
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {
		if(str.isEmpty())
			return str;
		else return reverse(str.substring(1))+str.charAt(0);	
	}
}
