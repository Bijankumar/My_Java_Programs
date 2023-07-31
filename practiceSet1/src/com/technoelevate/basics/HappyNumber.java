package com.technoelevate.basics;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your nummber here :");
		int no = scanner.nextInt();
		while(no>9)no=happy(no);
		if(no==1||no==7)
			System.out.println("It's a Hyppy Number !!");
		else
			System.out.println("It's not a Hyppy Number !!");
	}

	private static int happy(int no) {
		int sum =0;
		while(no!=0) {
			int rem = no%10;
			sum+=rem*rem;
			no/=10;
		}
		return sum;
	}
}
