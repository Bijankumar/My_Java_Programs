package com.technoelivate.Arrays;

import java.util.Arrays;

// 	SubArray with given Sum
public class SubArray_GivenSum {
	static int res=15,sum=0,count=1,x=0;
	static int arr[] = {12,5,8,2,10,3};

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			check(arr);
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if(sum<=res) {
//					sum+=arr[j];
//					count++;
//				}
//				if(sum==res)
//				break;
//			}
//		}
//		int []sub=new int[count];
//		for (int j = sub.length-1; j >=0 ; j--) {
//			sub[j]= arr[count--];
//		}
//		System.out.println(Arrays.toString(sub));
	}
	
	static void check(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=res) {
				sum+=arr[i];
				count++;
			}else if(sum==res) {
				int []sub=new int[count];
				for (int j = sub.length-1; j >=0 ; j--) {
					sub[j]= arr[count--];
				}
				System.out.println(Arrays.toString(sub));
			}
		}
		
	}
}
