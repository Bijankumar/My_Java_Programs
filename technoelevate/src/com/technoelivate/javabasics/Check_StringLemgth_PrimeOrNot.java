package com.technoelivate.javabasics;


public class Check_StringLemgth_PrimeOrNot {
	public static void main(String[] args) {
		String str = "Hii I am Bijan";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		
		FunctionalInteface face = CheckPrimeOrNot::prime;
		face.run(count);	
	}
}
