package NumbersPrograms;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting & Ending value");
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println("Enter nth value");
		int n = sc.nextInt(), count = 0;
		for (int i = a; i <= b; i++) {
			if (i > 1) {
				boolean flag = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					count++;
					if (count == n)
						System.out.print(i + " ");
				}
			}
		}
	}
}
