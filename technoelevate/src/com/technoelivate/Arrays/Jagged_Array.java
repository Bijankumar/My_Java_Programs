package com.technoelivate.Arrays;

public class Jagged_Array {
	public static void main(String[] args) {
		int n=5,x = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==j||i+j==n+1) {
					if(i<=n/2+1) {
						System.out.print(" "+i);
					x=i;
					}else		
						System.out.print(" "+x);
				}else
					System.out.print("  ");
			}
			System.out.println();
			x--;
		}
	}
}
