package com.technoelivate.Arrays;

import java.util.Arrays;

// Find the Union and Intersection of the two sorted arrays
public class Union_Intersection_Of_Two_Array {
	public static void main(String[] args) {
		int []arr = {12,20,15,25}, brr= {5,10,12,25,35};

		int count=0,x=0,y=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if(arr[i]==brr[j])
					count++;
			}
		}
		
		int [] union = new int[arr.length+brr.length-count];
		int [] intersection = new int[count];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if(arr[i]==brr[j]) {
					intersection[x++]=arr[i];
					brr[j]=-1;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			union[y++]=arr[i];
		}
		for (int i = 0; i < brr.length; i++) {
			if(brr[i]!=-1)
				union[y++] = brr[i];
		}
		
		System.out.println("Union of two Arrys : "+Arrays.toString(union));
		System.out.println("Intersection of two Arrys : "+Arrays.toString(intersection));
	}
}
