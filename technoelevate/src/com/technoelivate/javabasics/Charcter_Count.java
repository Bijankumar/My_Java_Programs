package com.technoelivate.javabasics;

public class Charcter_Count {
	public static void main(String[] args) {
		String name = "deepti";
		char str[] = name.toCharArray();
		int arr[] = new int[122];
		for (char ch : str) {
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
				System.out.println((char)i+"-->"+arr[i]);
		}	
	}
}
