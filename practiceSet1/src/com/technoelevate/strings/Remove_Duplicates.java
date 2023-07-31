package com.technoelevate.strings;

public class Remove_Duplicates {
	public static void main(String[] args) {
		String str = "Happy",res="";
		char []srr = str.toCharArray();
		for (int i = 0; i < srr.length; i++) {
			int count=1;
			for (int j = i+1; j < srr.length; j++) {
				if(srr[i]==srr[j]) {
					srr[j]=0;
					count++;
				}
			}
			if(srr[i]!=0) {
				res+=srr[i];
			}
			// Show Duplicates from String
//			if(count>1&&srr[i]!=0) {
//				System.out.println(srr[i]+"->"+count+"\n");
//			}
			
			// Show Occurrence of each Character
			if(srr[i]!=0) {
				System.out.println(srr[i]+"->"+count);
			}
		}
		System.out.println("\n"+res);
	}
}
