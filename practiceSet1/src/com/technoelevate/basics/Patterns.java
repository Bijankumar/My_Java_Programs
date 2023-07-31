package com.technoelevate.basics;

public class Patterns {
	public static void main(String[] args) {
		int n =5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) { //
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for(int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i>=j)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("======================");
		for(int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i>=j)
					System.out.print(j+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		for(int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i>=j)
					System.out.print(i+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		int x=1;
		for (int i = 1; i < n ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x++ + " ");
			}
			System.out.println();
		}
		System.out.println("======================");

		for (int i = 1; i < n ; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j%2 + " ");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 1; i <= n ; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j+" ");
			}
			for (int j = n/2; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		System.out.println("======================");
		int star=1,space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			if(i<n/2+1) {
				space--;
				star+=2;
			}else{
				space++;
				star-=2;
			}
			System.out.println();
		}
		System.out.println("======================");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i<j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		int size =3;
		for (int i = size; i >= -size; i--) {
			for (int j = 1; j <= Math.abs(i); j++) {
				System.out.print(" ");
			}
			for (int j = size; j >= Math.abs(i); j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("======================");
	}
}
