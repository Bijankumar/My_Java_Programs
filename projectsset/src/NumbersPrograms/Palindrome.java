package NumbersPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int no = sc.nextInt();
		int copy = no;
		int rev = 0;
		while (no != 0) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no /= 10;
		}
		if (copy == rev) {
			System.out.println("Number is Palindrome !!");
		} else {
			System.out.println("Number is not a Palindrome!!");
		}
	}
}
