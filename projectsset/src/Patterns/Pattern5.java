package Patterns;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter an Odd number :");
		int n = sc.nextInt();
		int star = 1,space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			if (i<n/2+1) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
		}
			
	}
}