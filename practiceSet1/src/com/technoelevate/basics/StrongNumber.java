package com.technoelevate.basics;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Number here : ");
		int no = scanner.nextInt(),copy=no,sum=0;
		while(no!=0) {
			int rem = no%10,fact=1;
			for (int i = rem; i >=1; i--)fact*=i;
			sum+=fact;
			no/=10;
		}
		if(copy==sum)
			System.out.println("It's a Strong Number !!");
		else
			System.out.println("It's not a Strong Number !!");
	}
}
