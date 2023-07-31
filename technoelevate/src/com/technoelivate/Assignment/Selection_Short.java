package com.technoelivate.Assignment;

import java.util.Arrays;

public class Selection_Short {
	public static void main(String[] args) {
		int [] arr = {9,3,1,8,2,7,11,4,10};
		for (int i = 0; i < arr.length-1; i++) {
			int big = i;	// 0
			for (int j = i+1; j < arr.length; j++) {
				if(arr[big]>arr[j]) 
					big=j;
			}
			int temp = arr[big];
			arr[big] = arr[i];
			arr[i] = temp;
//			System.out.println(Arrays.toString(arr)); 	// for tracing uncomment it.
		}
		System.out.println(Arrays.toString(arr));
	}
}
