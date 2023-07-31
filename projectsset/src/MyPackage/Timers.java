package MyPackage;

import java.util.Scanner;

public class Timers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An odd number ");
		int n = sc.nextInt(),space=0,star=n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(" *");
			}
			System.out.println();
			if (i<n/2+1) {
				space++;
				star-=2;
			}else {
				space--;
				star+=2;
			}
		}
	}
}
