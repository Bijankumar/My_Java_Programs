package com.technoelevate.basics;

// i/p = my---name---is----pani.
// o/p = my-name-is-pani.

public class StringProgram {
	public static void main(String[] args) {
		String str = "my-----name---is----pani",res="";
				str = str.replaceAll("-+", "-");
				System.out.println(str);
				//or
		char pre =0,ch;
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if(ch>='a'&&ch<='z') {
					pre=ch;
					res+=ch;
				}else {
					if(pre!=ch) {
					pre=ch;
					res+="-";
					}
				}
			}	
			System.out.println(res);		
	}
}
