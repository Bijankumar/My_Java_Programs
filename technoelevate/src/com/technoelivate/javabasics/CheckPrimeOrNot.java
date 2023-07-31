package com.technoelivate.javabasics;

public class CheckPrimeOrNot {
	public static void main(String[] args) {
			int no =7;
			prime(no);
	}

	public static void prime(int no) {
		for (int i = 2; i < no; i++) {
			if (no % i == 0)
				System.out.println("It's not a Prime Number!!");
			break;
		}
		System.out.println("It's a Prime Number !!");;
	}
}
