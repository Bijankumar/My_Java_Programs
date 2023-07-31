package com.technoelivate.javabasics;

import java.util.Arrays;

public class RemoveElementArray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int res[]= new int [arr.length-1];
		int element =30,x = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=element) {
			res[x]=arr[i];
			x++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
