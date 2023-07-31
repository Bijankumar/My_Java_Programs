package com.technoelevate.arrays;

import java.util.Arrays;

public class Array_Right_Rotation {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6},res=new int[arr.length];
		int rotate =3,x = 0,n=arr.length;

		for (int i = n-rotate; i < n; i++)res[x++]=arr[i];
		for (int i = 0; i < n-rotate ; i++)res[x++]=arr[i];
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}
}
