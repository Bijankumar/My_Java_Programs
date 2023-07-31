package com.technoelivate.Arrays;
	// Spiral pattern
public class Spiral_Pattern {
	public static void main(String[] args) {
		int n =5,x = 1,minR=0,minC=0,maxR=n-1,maxC=n-1;
		int [][] spiral =new int[n][n];
		while(x<=25) {
			for (int i = minC; i <= maxC; i++) {
				spiral[minR][i]=x++;
			}
			for (int i = minR+1; i <= maxR; i++) {
				spiral[i][maxC]=x++;
			}
			for (int i = maxC-1; i >= minC; i--) {
				spiral[maxR][i]=x++;
			}
			for (int i = maxR-1; i >= minR+1; i--) {
				spiral[i][minC]=x++;
			}
			minC++;minR++;maxC--;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(spiral[i][j]+" ");
			}
			System.out.println();
		}
	}
}
