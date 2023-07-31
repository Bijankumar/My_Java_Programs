package com.technoelevate.basics;

public class Conjicutive_Charterers {
	public static void main(String[] args) {
		String str = "goooodmoorniiinig",res="";
		char preChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=preChar)res+=str.charAt(i);
			preChar=str.charAt(i);
		}
		System.out.println(res);
	}
}
