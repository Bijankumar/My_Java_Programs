package com.technoelivate.javabasics;

public class Patterns {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j)
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("============01============");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i >= j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("=============02===========");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i <= j)
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=============03===========");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("==============04==========");
		int star = 1, space = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			if (i < n / 2 + 1) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}
		System.out.println("==============06==========");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j >= i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===============07=========");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===============08=========");

		int star1 = n, space1 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			star1 -= 2;
			space1++;
		}
		System.out.println("===============09=========");

		int star2 = 1, space2 = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < space2; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star2; j++) {
				System.out.print(" *");
			}
			System.out.println();
			star2 += 2;
			space2--;
		}
		System.out.println("===============10=========");
	}
}
