package com.technoelevate.basics;

public class Dimond_String {
	public static void main(String[] args) {
		String str = "Bijan";
		int size =str.length()/2,x=0;
		for (int i = size; i >= -size; i--) {
			for (int j = 1; j <=Math.abs(i); j++) {
				System.out.print(" ");
			}
			for (int j = size; j >=Math.abs(i); j--) {
				System.out.print(str.charAt(j)+" ");
			}
			
			System.out.println();
		}
	}
}
