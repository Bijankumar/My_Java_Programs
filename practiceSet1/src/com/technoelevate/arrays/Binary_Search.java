package com.technoelevate.arrays;

import java.util.Arrays;

public class Binary_Search {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9};// Should be sorted array for binary search 

//		System.out.println(Arrays.binarySearch(arr, 5));
		
		int target =5,left=0,right=arr.length-1,mid,count=0;
		while(left<right) {
			mid=(left+right)/2;
			if(target==arr[mid]) { count++;
			System.out.println("The Position is : "+mid);
			break;
			}
			else if(target<arr[mid])right=mid-1;
			else left=mid+1;
		}
		if(count==0)System.out.println("Sorry!! Match Not Found!!");
	}
}
