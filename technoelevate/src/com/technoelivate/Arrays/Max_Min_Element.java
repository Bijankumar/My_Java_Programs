package com.technoelivate.Arrays;

import java.util.Arrays;
//	Find the minimum and maximum element in an array
public class Max_Min_Element {
	public static void main(String[] args) {
		int arr [] = {5,8,25,36,78,41,56,69};
		Arrays.sort(arr);
		System.out.println("Min Value : "+arr[0]+"\n"+"Max Value : "+arr[arr.length-1]);
	}
}
