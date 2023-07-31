package Revision;

import java.util.Scanner;

public class Range_of_Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start range");
		int start = sc.nextInt();
		System.out.println("Enter the End range");
		int end = sc.nextInt();
		System.out.println("Enter the 'n'th number");
		int n = sc.nextInt();
		int x = 0;
//		boolean flag;
//		for (int i = start; i <= end; i++) {
//			flag = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag == true) {
//				x++;
//				if (x == n) {
//					System.out.print("The " + n + "th prime no. is :" + i);
//					break;
//				}
//			}
//		}if (x != n) {
//			System.out.println("Invalid Range");
//		}
		for (int i = start; i <= end; i++) {
			int count = 0; 
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
//				System.out.print(i + " is a Prime number");
				x++;
				if (x == n) {
					System.out.print("The " + n + "th prime no. is :" + i);
					break;
				}
			} 
		}if (x != n)
			System.out.println("Please Enter your Choise Within the Range");
	}
}