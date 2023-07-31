package com.technoelivate.Assignment;
// Perfect number (6)
public class Perfect_Number {
	public static void main(String[] args) {
		int no = 28,sum=0;
		for (int i = 1; i <= no/2; i++) {
			if(no%i==0)
				sum+=i;
		}
		if(sum==no)
			System.out.println(no+" is a Perfect Number !!");
		else
			System.out.println(no+" is not a Perfect Number !!");
	}
}
