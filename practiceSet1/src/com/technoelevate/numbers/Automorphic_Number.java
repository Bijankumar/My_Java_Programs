package com.technoelevate.numbers;

public class Automorphic_Number {
	public static void main(String[] args) {
		int no = 25;
		if(autoMorphic(no))
			System.out.println("It's a AutoMorphic Number !!");
		else 
			System.out.println("It's not a AutoMorphic Number !!");
	}

	private static boolean autoMorphic(int no) {
		int sqr =no*no;
		while(no!=0) {
			int rem1 = no%10;
			int rem2= sqr%10;
			if(rem1!=rem2)return false;
			else {
				no/=10;
				sqr/=10;
			}
		}	
		return true;
	}
}
