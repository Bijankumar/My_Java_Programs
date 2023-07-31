package com.technoelevate.arrays;

public class Second_Smallest {
	public static void main(String[] args) {
		int []arr = {5,6,9,8,5,4,75,45,12,2};
		int small=arr[0],secSmall = 0;
		for (int i = 1; i < arr.length; i++) {
			secSmall=small;
			small=(small>arr[i])?arr[i]:small;
		}
		System.out.println(secSmall);
	}
}
