package com.technoelivate.javabasics;

public class DiuplicateValuesArrya {
	public static void main(String[] args) {
		int arr[]={1,2,3,2,4,5,1};int count;
		for (int i = 0; i < arr.length; i++) {
			count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
				}
			}
			if(count>1 && arr[i]!=-1)
				System.out.print(arr[i]+" ");		
		}
	}
}
