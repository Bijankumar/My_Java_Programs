package com.technoelivate.Arrays;

import java.util.Arrays;

//	Sort the array of 0s, 1s, and 2s
public class Sorting_0S_1S {
	public static void main(String[] args) {
		int arr[] = {0,0,1,2,0,1,0,1,1,0,1,2};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
