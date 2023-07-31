package Patterns;

import java.util.Scanner;

public class SymbolTimerShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an odd Number :");
		int n= sc.nextInt();
		int star=n,space=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
			if (i%2==0||k%2==0)
				System.out.print("! ");
			else
				System.out.print("@ ");
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
