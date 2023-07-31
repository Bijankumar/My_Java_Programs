package com.technoelivate.Assignment;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 25, 15, 10, 20, 30, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		if(arr.length==1)
			return;
		int []left = new int [arr.length/2],right = new int [arr.length-left.length];
	for (int i = 0; i < left.length; i++) {
		left[i]=arr[i];
	}
	for (int i = 0; i < right.length; i++) {
		right[i]=arr[left.length+i];
	}
	sort(left);
//	System.out.println(Arrays.toString(left));//for tracing uncomment
	sort(right);
//	System.out.println(Arrays.toString(right));//for tracing uncomment
	merge(left,right,arr);
	
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int a=0,b=0,c=0;
		while(a<left.length&&b<right.length) {
			if(left[a]<right[b])
				arr[c++]=left[a++];
			else
				arr[c++]=right[b++];
		}
		while(a<left.length) {
			arr[c++]=left[a++];
		}
		while(b<right.length) {
			arr[c++]=right[b++];
		}
	}
}
