package com.technoelivate.javabasics;

import java.util.Arrays;

public class Short_In_Decending_Array {
	public static void main(String[] args) {
		int arr[]={1,3,5,2,4};
		Arrays.sort(arr);
		for (int i= arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
