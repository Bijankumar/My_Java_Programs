package com.technoelevate.arrays;

import java.util.Arrays;

public class ArrangeNumbersArray {
	public static void main(String[] args) {
		int [] arr = {0,1,1,0,1,0,1,0,0,1};
		for (int i = 0,j=arr.length-1; i < arr.length; i++) {
			if(arr[i]==0) {
				if(arr[j]!=0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j--;
				}else {
					j--;i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
