package MyPackage;

import java.util.Scanner;

public class Piramid_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Odd number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i>=j)
				System.out.print("* ");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}