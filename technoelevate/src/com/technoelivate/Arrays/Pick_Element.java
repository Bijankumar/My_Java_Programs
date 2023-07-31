package com.technoelivate.Arrays;

import java.util.Arrays;
//Find a peak element which is not smaller than its neighbors
public class Pick_Element {
	public static void main(String[] args) {
		int arr[] = {15,25,75,89,42,20,30};
		Arrays.sort(arr);
		System.out.println("The pick Element is : "+arr[arr.length-1]);
	}
}
