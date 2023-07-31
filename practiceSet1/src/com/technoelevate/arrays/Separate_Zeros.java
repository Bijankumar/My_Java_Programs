package com.technoelevate.arrays;

import java.util.Arrays;

public class Separate_Zeros {
	public static void main(String[] args) {
		int[] arr = { 4, 7, -1, 0, 0, -5, -7, 0, 0, 6, -2 };
		System.out.println(Arrays.toString(arr));
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[x];
				arr[x] = temp;
				x++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
