package com.technoelevate.numbers;

public class Sunny_Number {
	public static void main(String[] args) {
		int no = 8;
		if(checkSqr(no+1))
			System.out.println("It's a Sunny Number !!");
		else
			System.out.println("It's not a Sunny Number !!");
	}

	private static boolean checkSqr(int no) {
		int i=1;
		while(i<no/2) {
			if(no==i*i)
				return true;
			else
				i++;
		}
		return false;
	}
}
