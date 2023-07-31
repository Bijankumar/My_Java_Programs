package NumbersPrograms;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		String str =" ";
		while (no!=0) {
			int rem=no%2;
			str=rem+str;
			no=no/2;
		}
		System.out.println(str);
	}
}
