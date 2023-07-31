package com.technoelivate.Arrays;
//	Find the occurrence of an integer in the array

public class Occurrence_Of_Integer {
	public static void main(String[] args) {
		int arr[]= {10,20,50,20,30,10,50,40};
		int count;
		for (int i = 0; i < arr.length; i++) {
			 count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
				System.out.println(arr[i]+" => "+ count);
		}
	}
}
