package com.technoelivate.Assignment;
//	Swap two no without using temp 
//	i/p:  a=10, b=20 
//	o/p: b=10, a=20

public class Swap_Without_Temp {
	public static void main(String[] args) {
		int a = 10,b = 20;
		System.out.println("Initially : a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swaped : a = "+a+" b = "+b);
	}
}
