package com.technoelivate.javabasics;

public class Second_Highest_Occurrence {
	public static void main(String[] args) {
		String name = "abbbbasssss ali";
		name = name.replace(" ", "");
		char str[] = name.toCharArray();
		int arr[] = new int[122];
		int highest=0, secondHighest=0;
//		for (char ch : str) {
//			arr[ch]++;
//		}
		for (int i = 0; i < str.length; i++) {
			char ch = str[i];
			arr[ch]++;
		}
		for (int count:arr) {
//		for(int count = 0; count < arr.length; count++) {
			if (count > highest) {
				secondHighest = highest;
				highest = count;
			} else if (count > secondHighest && count < highest)
				secondHighest = count;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==secondHighest)
				System.out.println((char)i+"==>"+arr[i]);
		}
	}
}
