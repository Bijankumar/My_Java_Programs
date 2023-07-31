package com.technoelivate.Assignment;

import java.util.Arrays;

//	 Quick sort
public class Quick_Sort {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 10, 17, 1, 3, 9, 2, 20 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		int i=start,j =end;
		if(start==end)return;
		int pivot =(start+end)/2;
		while(start<=end) {
			
		while(arr[start]<pivot) {
			i++;
		}
		while(arr[end]>pivot) {
			j--;
		}
		if(start<end) {
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j]=temp;
			i++;
			j--;
			}
		}
		quickSort(arr, start, j);
		quickSort(arr, i, end);
	}
}
