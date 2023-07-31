package com.technoelivate.Assignment;
	//UpperCase & LowerCase Conversion
	//	i/p	: Techno Elevate
	//	o/p	: tECHNO eLEVATE

public class Upper_Lower_Conversion {
	public static void main(String[] args) {
		String str = "Techno Elevate",srr,rev;
		String [] res = str.split(" ");
		for (int i =0;i<res.length;i++) {
			srr=res[i].toUpperCase();
			rev="";char ch;
			for (int j = 0; j < srr.length(); j++) {
				if(j==0) {
					ch =(char) (srr.charAt(j)+32);
					rev+=ch;
				}else
					rev+=srr.charAt(j);
			}
			res[i]=rev;	
		}
		for (String string : res) {
			System.out.print(string+" ");
		}
	}
}
