package com.technoelevate.arrays;

import java.util.Arrays;

public class Array_Left_Rotation {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5},res=new int[arr.length];
		System.out.println("Before Rotation :"+Arrays.toString(arr));
		int rotate =1,x=0;
		for (int i = rotate; i < arr.length; i++)res[x++]=arr[i];
		for (int i = 0; i < rotate; i++)res[x++]=arr[i];
		
		System.out.println("After Rotation :"+Arrays.toString(res));
	}
}
