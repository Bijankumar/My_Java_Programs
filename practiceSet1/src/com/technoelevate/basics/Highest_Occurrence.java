package com.technoelevate.basics;

import java.util.Scanner;

public class Highest_Occurrence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String here");
		String str = scanner.nextLine().toLowerCase();
		int [] count  = new int[122];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		int max=count[0];
		for (int i = 0; i < count.length; i++) {
			if(count[i]>max)
				max=count[i];
		}
		for (int j = 0; j < count.length; j++) {
			if(count[j]==max)
				System.out.println((char)j+"->"+max);
		}
	}
}
