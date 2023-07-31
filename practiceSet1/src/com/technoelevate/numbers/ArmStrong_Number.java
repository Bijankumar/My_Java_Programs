package com.technoelevate.numbers;

public class ArmStrong_Number {
	public static void main(String[] args) {
		int no = 153,sum=0,copy=no;
		while(no!=0) {
			int base =no%10;
			sum+=power(base,count(copy));
			no/=10;
		}
		if(copy==sum)
			System.out.println("It's a Armstrong Number!!");
		else
			System.out.println("It's not a Armstrong Number!!");
	}

	private static int power(int base, int exp) {
		int ans =1;
		while(exp!=0) {
			ans=ans*base;
			exp--;
		}
		return ans;
	}

	private static int count(int no) {
		int count =0;
		while(no!=0) {
			no=no/10;
			count++;
		}
		return count;
	}
}
