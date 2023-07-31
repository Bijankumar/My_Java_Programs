package com.technoelevate.arrays;

public class Compare_Two_Arrays {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5},brr= {1,2,3,4,5};
		int i=0;boolean equal=true;
		if(arr.length==brr.length) {
			while(arr[i]!=brr[i]) {
				equal=false;
			}
		}else {
			System.out.println("It's not Equals !!");
		}
		if(equal)
			System.out.println("It is Equal to Another !!");
		else
			System.out.println("It's not Equals !!");
	}
}
