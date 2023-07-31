package com.technoelevate.strings;

public class Remove_ConjicutiveCharacter {
	public static void main(String[] args) {
		String str = "aaabbbaccbhecfgg", res = "";
		char[] srr = str.toCharArray();
		char preChar = 0;
		for (int i = 0; i < srr.length; i++) {
			if(srr[i]!=preChar) {
				res+=srr[i];
				preChar=srr[i];
			}
		}
		System.out.println(res);
	}
}
