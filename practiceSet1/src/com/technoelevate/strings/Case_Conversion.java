package com.technoelevate.strings;

public class Case_Conversion {
	public static void main(String[] args) {
		String str = "Chakra Pani",res="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				res+=(char)(ch+32);
			}else if (ch>='a'&&ch<='z'){
				res+=(char)(ch-32);
			}else {
				res+=ch;
			}
		}
		System.out.println(res);
	}
}
