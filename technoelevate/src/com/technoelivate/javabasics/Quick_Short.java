package com.technoelivate.javabasics;

import java.util.Arrays;

public class Quick_Short {
	public static void main(String[] args) {
		int [] arr = {12,5,35,15,20,10,25};
		int lb=0,ub=arr.length-1;
		quickShorting(arr,lb,ub);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickShorting(int [] arr, int lb, int ub) {
		if(lb<ub) {
			int pi = partioning(arr,lb,ub);
			
			quickShorting(arr,lb,pi-1);
			quickShorting(arr,pi+1,ub);
		}
		
	}

	private static int partioning(int[] arr, int lb, int ub) {
		int pivot = arr[ub];
		int j = lb-1;
		
		for (int i = lb; i < ub; i++) {
			j++;
			
		}
		return 0;
	}
}
