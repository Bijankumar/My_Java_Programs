package com.technoelevate.numbers;

public class PerfectNumber {
	public static void main(String[] args) {
		int no = 28,sum=0;
		for (int i = 1; i <=no/2 ; i++) {
			if(no%i==0)
				sum+=i;
		}
		if(sum==no)
			System.out.println("It's a Perfect Number !!");
		else
			System.out.println("It's not a Perfect Number !!");
	}
}
