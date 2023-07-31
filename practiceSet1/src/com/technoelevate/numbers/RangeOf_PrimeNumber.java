package com.technoelevate.numbers;

public class RangeOf_PrimeNumber {
	public static void main(String[] args) {
		int start =20,end=50;
		System.out.println("The PrimeNumbers within the range of "+start+" & "+end+" are");
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j <= i/2; j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) System.out.print(i+" ");
		}
	}
}
