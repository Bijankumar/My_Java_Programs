package com.jsp.meena;

// Find the largest number among 3 number.

public class Largest_Among_3 {
	public static void main(String[] args) {
		int no1= 10,no2=65,no3=5;
		int largest = no1; //let suppose no1 is largest
		if(largest<no2) largest = no2;
		if(largest<no3) largest = no3;
		System.out.println(largest);
	}
}
