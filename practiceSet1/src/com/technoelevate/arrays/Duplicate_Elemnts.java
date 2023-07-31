package com.technoelevate.arrays;

public class Duplicate_Elemnts {
	public static void main(String[] args) {
		int []arr = {10,20,45,20,10,85,15,20,45,10};
		int count;
		System.out.println("The Duplicate elements are : ");
		for (int i = 0; i < arr.length; i++) {
			count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
					count++;
				}
			}
			if(count>1&&arr[i]!=-1)
				System.out.println(arr[i]+"->"+count);
		}
	}
}
