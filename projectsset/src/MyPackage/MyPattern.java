 package MyPackage;

import java.util.Scanner;

public class MyPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Odd Value..");
		int n = sc.nextInt(),space=n/2,star=1;
		//Dimond Pattern
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i<n/2+1) {
				space--;
				star+=2;
			} else {
				space++;
				star-=2;
			}
		}
		
		System.out.println("==========");
		//Piramid(Upward > j--)
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		//Piramid(Downward < j++ )
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i<=j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		// LeftAngle Triangle(Upward > j++)
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		// RightAngle Triangle(Upward > j--)
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		//LeftAngle Triangle(Downward < j--)
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		// RightAngle Triangle(Downward < j++)
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
