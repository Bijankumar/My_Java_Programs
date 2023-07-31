package com.technoelevate.numbers;

public class PrimeNumberOr_Not_UsingRecursion {
	public static void main(String[] args) {
		int no = 23;
		if (primeNumber(no))
			System.out.println("It's a Prime Number !!");
		else
			System.out.println("It's not a Prime Number !!");
	}

	static boolean flag = true;
	static int i = 2;

	private static boolean primeNumber(int no) {
		if(i<no) {
		if (no % i == 0) {
			flag = false;
			return flag;
		} else if(i<no) {
			i++;
			primeNumber(no);
			return flag;
		}else return flag;
		}else return flag;
	}
}
