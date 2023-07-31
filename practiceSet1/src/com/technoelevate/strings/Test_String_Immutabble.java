package com.technoelevate.strings;

public class Test_String_Immutabble {
	public static void main(String[] args) {
		String s = "Bijan";
		System.out.println(s+" "+s.hashCode());
			   s = "Bijan";
		System.out.println(s+" "+s.hashCode());
	}
}
