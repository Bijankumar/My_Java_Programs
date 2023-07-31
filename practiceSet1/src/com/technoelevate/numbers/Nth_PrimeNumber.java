package com.technoelevate.numbers;

public class Nth_PrimeNumber {
	public static void main(String[] args) {
		int count =0,n=5;
		for (int i = 1; i <= 50; i++) {
			boolean flag =true;
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				count++;
				if(count==n) System.out.println(i+" is "+n+"th Prime Number!!");
			}
		}
	}
}
