package com.technoelevate.arrays;

import java.util.Arrays;

public class SeparateNagetivePositive {
	public static void main(String[] args) {
		int [] arr = {4,5,7,-1,0,0,-5,-7,0,0,6,-2},res=new int[arr.length];
		int x=0,y=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				res[x++]=arr[i];}
			else if(arr[i]>=0) {
				res[y--]=arr[i];}
		}
		System.out.println(Arrays.toString(res));
	}
}
