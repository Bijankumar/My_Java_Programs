package com.technoelivate.javabasics;

import java.util.Arrays;

public class BubbleShort {
	public static void main(String[] args) {
		int []arr = {15,45,78,45,12,46,25};
		int n = 2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
//				System.out.println(Arrays.toString(arr));   //for tracing uncomment
			}
		}
//		for (int i = 0; i < arr.length; i++) {	//without inbuilt method print array
//			System.out.print(arr[i]+" ");
//		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length-n]);
	}
}
