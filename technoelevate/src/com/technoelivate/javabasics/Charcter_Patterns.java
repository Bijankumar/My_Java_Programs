package com.technoelivate.javabasics;

public class Charcter_Patterns {
	public static void main(String[] args) {
		int n = 5, x;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j <= i)
					System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j <= i)
					System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i < n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j <= i)
					System.out.print(j+" ");
			}
			for (int j = n; j >= 2; j--) {
				if (j <= i)
					System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
					System.out.print(j+" ");
			}
			for (int j = n-1; j >= i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
