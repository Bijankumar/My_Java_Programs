package com.technoelevate.basics;

import java.util.Scanner;

public class Character_Count {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String here :");
		String str = scanner.nextLine().toLowerCase();
		int count[] = new int[122];int sum=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]!=0&&(char)i!=' ') {
//				System.out.println((char)i+"-->"+count[i]);
				sum+=count[i];
			}
		}
		System.out.println("Total Number of char is : "+sum);
	}
}
