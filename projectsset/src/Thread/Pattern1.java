package Thread;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. ");
		int n = sc.nextInt();
		// 1st pattern
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= j)
					System.out.print("* ");
				// Thread.sleep(500);
			}
			System.out.println();
		}
		// 2st pattern
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j)
					System.out.print("* ");
				// Thread.sleep(500);
			}
			System.out.println();
		}
	}
}
