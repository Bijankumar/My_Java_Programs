package com.technoelivate.Assignment;

import java.util.concurrent.ThreadPoolExecutor;

// CamelCase conversion
//	i/p	: techono elevate
//	o/p	: Techno Elevate

public class Camale_Case {
	public static void main(String[] args) {
		String str = "techono elevate bijan kumar",res="";
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			if(i==0)
				res+=(char)(ch-32);
			else if(ch==' ') {
				res+=ch;
				i++;
				ch=str.charAt(i);
				res+=(char)(ch-32);
			}else
				res+=(char)ch;
		}
		System.out.print(res);
	}
}
