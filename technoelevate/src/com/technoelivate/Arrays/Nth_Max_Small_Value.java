package com.technoelivate.Arrays;
//	Find the 'nth' largest and nth smallest number in an array

import java.util.Arrays;

public class Nth_Max_Small_Value {
	public static void main(String[] args) {
		int n=3;
		int arr[] = {10,5,25,60,40,35,30};
		Arrays.sort(arr);
		System.out.println("The "+n+"th Smallest Value : " +arr[n]+"\n"+"The "+n+"th Biggest Value :"+arr[arr.length-n]);
	}
}
