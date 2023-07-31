package com.technoelivate.Arrays;

import java.util.Arrays;
// Move all the negative elements to one side of the array
public class Arrange_Negetive_Positive {
	public static void main(String[] args) {
		int arr[] = {10,5,-20,-15,-4,-8,22};
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(res));

		int y=0;
		int res [] = new int[arr.length];
			
		for (int i = 0; i < res.length; i++) {
			if(arr[i]<0)
				res[y++]=arr[i];
		}
		for (int i = 0; i < res.length; i++) {
			if(arr[i]>0)
				res[y++]=arr[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
