package com.technoelevate.basics;

public class CountWords_WithoutSplit {
	public static void main(String[] args) {
		String str = "Java  is a Programming Language .";
				str= str.toLowerCase();
				int count =1;
		char ch,chh = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(i<str.length()-1)chh=str.charAt(i+1);
			if(ch==' '&&(chh>='a'&& chh<='z'))count++;
		}
		System.out.println(count);
	}
}
