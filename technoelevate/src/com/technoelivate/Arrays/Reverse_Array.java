package com.technoelivate.Arrays;

import java.util.Arrays;
// Write a program to reverse the array
public class Reverse_Array {
	public static void main(String[] args) {
		int arr[] = {15,20,35,78,10,5,23,12};
		int x = 0;
		int rev[] = new int[arr.length];
		for (int i = arr.length-1; i >= 0;i--) {
			rev[x++] =arr[i];
		}
//		System.out.println(Arrays.toString(rev));
						//or
		for (int i : rev) {
			System.out.print(" "+i+" ");
		}
	}
}
