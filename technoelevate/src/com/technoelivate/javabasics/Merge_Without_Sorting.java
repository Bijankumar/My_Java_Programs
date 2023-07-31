package com.technoelivate.javabasics;

import java.util.Arrays;

//Merge with out sorting and give result in sorted order.

// a1 = {45,25,42,10,20};  
// a2 = {1,5,9,6,15,2};
//==========================//
// o/p = {1,2,5,6,9,10,15,20,25,42,45};

public class Merge_Without_Sorting {
	public static void main(String[] args) {
		int []arr1 = {45,25,42,10,20,102},arr2 ={1,5,9,6,15,2};
		int []merge	= new int[arr1.length+arr2.length];
		int x=0;
		for (int i = 0; i < arr1.length; i++) {
			merge[x++]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			merge[x++]=arr2[i];
		}
		
//		System.out.println(Arrays.toString(merge));
		
		int no=1,a=0;
		int []res	= new int[merge.length];
		
		while(a<res.length) {
			for (int i = 0; i < merge.length; i++) {
				if(merge[i]==no)
					res[a++] = merge[i];
			}
			no++;
		}
		System.out.println(Arrays.toString(res));
	}
}
