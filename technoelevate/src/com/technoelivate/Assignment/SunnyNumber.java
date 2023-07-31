package com.technoelivate.Assignment;

public class SunnyNumber {
	public static void main(String[] args) {
		int no = 8;
		if(no+1==check(no+1))
			System.out.println("It is Sunny Number!!");
		else
			System.out.println("It not a Sunny nymber!!");
	}

	private static int check(int i) {
		for (int j = 1; j < i/2; j++) {
			if(j*j==i)
				return i;
		}
		return 0;
	}
}
