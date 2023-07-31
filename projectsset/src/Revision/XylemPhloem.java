package Revision;

import java.util.Scanner;

public class XylemPhloem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int no = sc.nextInt(), copy = no, isum = 0, osum = 0;
		while (no != 0) {
			if (no == copy || no < 10)
				osum += no % 10;
			else
				isum += no % 10;
			no/=10;
		}	
		if (osum == isum)
			System.out.println("Xylem Number!!");
		else
			System.out.println("Phloem Number!!");
	}
}
