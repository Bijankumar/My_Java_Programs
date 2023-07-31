package com.technoelivate.Assignment;
// Find Out Largest number from given array

// i/p: 1,3,5,6,2 
// o/p: 6

public class Largest_Number_From_Array {
	public static void main(String[] args) {
		int []arr = {1,3,5,6,2,10};
		int largest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(largest<arr[i])
				largest=arr[i];	
		}
		System.out.println(largest);
	}
}
