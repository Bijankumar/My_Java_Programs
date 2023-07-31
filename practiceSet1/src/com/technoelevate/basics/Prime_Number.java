package com.technoelevate.basics;

public class Prime_Number {
	static int i=2;
	public static void main(String[] args) {
		boolean flag =true;
		if(flag==primeNumber(7))
			System.out.println("Prime no !!");
		else
			System.out.println("Not a Prime no !!");
	}

	private static boolean primeNumber(int no) {
		if(no%i==0)
			return false;
		else {
			i++;
			if(i<no)
				return primeNumber(no);
			else
				return true;
		}
	}
	
}
