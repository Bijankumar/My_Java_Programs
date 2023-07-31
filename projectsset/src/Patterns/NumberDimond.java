package Patterns;

import java.util.Scanner;

public class NumberDimond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an odd Number :");
		int n= sc.nextInt();
		int star=1,space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(k+" ");
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
