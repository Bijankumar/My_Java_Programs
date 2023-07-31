package Revision;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a Number :");
		int no = sc.nextInt(), copy = no, sum = 0;
		while (no != 0) {
			int base = no % 10;
			sum += power(base, count(copy));
			no /= 10;
		}
		if(copy==sum)
			System.out.println("Armstrong Number!!");
		else
			System.out.println("Not a Armstrong Number!!");
	}

	private static int power(int base, int exp) {
		int ans = 1;
		while (exp != 0) {
			ans *= base;
			exp--;
		}
		return ans;
	}

	private static int count(int copy) {
		int count = 0;
		while (copy != 0) {
			copy /= 10;
			count++;
		}
		return count;
	}
}
