package com.technoelivate.Arrays;

import java.util.Arrays;

// Write a program to sort the given array
public class Sort_Given_Array {
	public static void main(String[] args) {
		int arr[] = {15,12,2,5,25,50};
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
