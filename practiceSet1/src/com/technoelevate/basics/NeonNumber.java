package com.technoelevate.basics;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter your number here :");
		int no = scanner.nextInt();
		if(no==neon(no*no))
			System.out.println("It's a Neon Number !!");
		else
			System.out.println("It's not a Neon Number !!");
	}

	private static int neon(int no) {
		int sum =0;
		while(no!=0) {
			int rem=no%10;
			sum+=rem;
			no/=10;
		}	
		return sum;
	}
}
