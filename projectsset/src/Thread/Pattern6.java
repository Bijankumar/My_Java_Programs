package Thread;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an odd number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= j) {
//					Thread.sleep(1000);
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i >= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		 * for (int i = n; i >= 1; i--) { for (int j = 1; j <= i; j++) {
		 * System.out.print("* "); } System.out.println(); }
		 */
	}
}
