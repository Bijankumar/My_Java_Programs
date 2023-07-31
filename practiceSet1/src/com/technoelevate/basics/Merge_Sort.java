package com.technoelevate.basics;

import java.util.Arrays;

public class Merge_Sort {
	public static void main(String[] args) {
		int []arr = {5,10,30,25,15,35};
		sort(arr);	// pass this array to sort method..
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		if(arr.length==1) return;	// if the array has single value return back from here only.
		
//  Now create two arrays like left and right to do partition of given array.
		int []left = new int [arr.length/2];
		int []right = new int [arr.length-left.length];

// now store all left side elements in left array so on for right side. 		
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[left.length+i];
		}

// now send the left and right array to pass away through this process.
		sort(left);
		sort(right);
		
// Now Merge those small parts according to his proper position.
		merge(left,right,arr);
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int a=0,b=0,c=0;
		while(a<left.length&&b<right.length) {
			if(left[a]<right[b])
				arr[c++] = left[a++];
			else
				arr[c++] = right[b++];
		}
		while(a<left.length) {
			arr[c++] = left[a++];
		}
		while(b<right.length) {
			arr[c++] = right[b++];
		}
	}
}
