package com.technoelevate.numbers;

public class Desarium_Number {
	public static void main(String[] args) {
		int no = 175,sum=0,copy=no;
		while(no!=0) {
			int base = no%10;
			sum+=power(base,count(no));
			no/=10;
		}
		if(copy==sum)
			System.out.println("It's a Deserium Number !!");
		else
			System.out.println("It's not a Deserium Number !!");
	}

	private static int power(int base, int exp) {
		int ans =1;
		while(exp!=0) {
			ans*=base;
			exp--;
		}
		return ans;
	}

	private static int count(int no) {
		int count=0;
		while(no!=0) {
			no/=10;
			count++;
		}
		return count;
	}
}
