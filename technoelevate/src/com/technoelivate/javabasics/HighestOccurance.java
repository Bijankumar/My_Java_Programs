package com.technoelivate.javabasics;

public class HighestOccurance {
	public static void main(String[] args) {
		String name = "Depdptidttpppt";
		char[] res = name.toLowerCase().toCharArray();
		int count, frequency=1;
		char ch = 0;
		for (int i = 0; i < res.length; i++) {
			count=1;
			for (int j = i + 1; j < res.length; j++) {
				if (res[i] == res[j]) {
					count++; //2
					res[j] = 0;
				}
			}
			if (frequency<count&res[i]!= 0) {
				frequency=count;
				ch=res[i];
			}
		}
		System.out.println(ch+"==>"+frequency);
	}
}
