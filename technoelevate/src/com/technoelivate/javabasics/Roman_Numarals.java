package com.technoelivate.javabasics;

public class Roman_Numarals {
	public static void main(String[] args) {
		int no = 101;
		
//		int[] numarlno = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
//		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		
		int[] numarlno = {1000,500,100,50,10,5,1 };
		String[] roman = {"M","D","C","L","X", "V", "I" };
		String rom = ""; 
		for (int i = 0; i < numarlno.length; i++) {
			while (no >= numarlno[i]) {
				no =  no - numarlno[i] ;
				rom+=roman[i];
			}
		}
		System.out.println("Roman Letter is :" + rom);
	}
}
