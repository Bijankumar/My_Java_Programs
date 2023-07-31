package com.technoelivate.Assignment;
// Duplicate Character find out
//	i/p:  “deepti” 
//	o/p: e,e

public class Duplicate_Character {
	public static void main(String[] args) {
		String str = "deepti";int count;
		char[] srr = str.toCharArray();
		for (int i = 0; i < srr.length; i++) {
			count =1;
			for (int j = i+1; j < srr.length; j++) {
				if(srr[i]==srr[j]) {
					count++;
					srr[j]=0;
				}
			}
			if(count>1&&srr[i]!=0)
				System.out.println(srr[i]+"-->"+count);
		}
	}
}
