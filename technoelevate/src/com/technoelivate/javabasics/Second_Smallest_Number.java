package com.technoelivate.javabasics;

import java.util.Arrays;

public class Second_Smallest_Number {
	public static void main(String[] args) {
		int n = 2;
		int []arr = {12,15,18,90,56,66};
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
	
	}
}
