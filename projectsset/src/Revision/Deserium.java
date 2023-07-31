package Revision;

import java.util.Scanner;

public class Deserium {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a numaber :");
		int no = sc.nextInt(), sum = 0, copy = no;
		while (no != 0) {
			int base = no % 10;
			sum += power(base, count(no));
			no /= 10;
		}
		if (copy == sum)
			System.out.println("Deserium Number!!");
		else
			System.out.println("Not A Deserium Number!!");
	}

	private static int power(int base, int exp) {
		int ans = 1;
		while (exp != 0) {
			ans *= base;
			exp--;
		}
		return ans;
	}

	private static int count(int no) {
		int count = 0;
		while (no != 0) {
			no /= 10;
			count++;
		}
		return count;
	}
}
