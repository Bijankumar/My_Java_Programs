package com.technoelevate.basics;

public class Camel_Case {
	public static void main(String[] args) {
		String str = "i am java student",tem,rev;
		String []srr = str.split(" ");
		for (int i = 0; i < srr.length; i++) {
			tem=srr[i];rev="";
			for (int j = 0; j < tem.length(); j++) {
				if(j>0)rev+=tem.charAt(j);
				else rev+=(char)(tem.charAt(j)-32);
			}
			srr[i]=rev.length()+""+rev;
		}
		for (String s : srr) {
			System.out.print(s+" ");
		}
	}
}
