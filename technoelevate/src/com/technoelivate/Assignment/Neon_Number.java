package com.technoelivate.Assignment;
//	Neon number (9) // square's sum of digits equal to given Number
//	9 -> 9*9=81 8+1 =9
public class Neon_Number {
	public static void main(String[] args) {
		int no = 9 , sum = 0;
		int square = no*no;
		while(square!=0) {
			int rem = square%10;
			sum+=rem;
			square/=10;
		}
		if(sum==no)
			System.out.println(no+" is a Neon Number !!");
		else
			System.out.println(no+" is not a Neon Number !!");
	}
}
