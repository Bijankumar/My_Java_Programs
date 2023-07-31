package Patterns;

import java.util.Scanner;

public class HaloDigram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Odd Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j==n/2+2||i+j==n/2+n+1||i-j==n/2||j-i==n/2) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
				
	}
}
