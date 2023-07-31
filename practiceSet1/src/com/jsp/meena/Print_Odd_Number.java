package com.jsp.meena;

// Print Odd numbers till 100 which is divisible by 5 using for loop;

public class Print_Odd_Number {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i=i+2) {
			if(i%5==0)System.out.println(i);
		}
	}
}
