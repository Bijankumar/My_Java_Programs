package com.technoelevate.arrays;

import java.util.Arrays;

public class Reverse_Array{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9},rev= new int[arr.length];
		System.out.println("Before Reverse :"+Arrays.toString(arr));
		int x=0;
		for (int i = arr.length-1; i >= 0; i--) {
			rev[x]=arr[i];
			x++;
		}
		System.out.println("After Reverse :"+Arrays.toString(rev));
	}
}
