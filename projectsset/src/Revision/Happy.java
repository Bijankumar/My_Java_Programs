package Revision;

import java.util.Scanner;

public class Happy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numaber :");
		int no=sc.nextInt();
		while(no>9)
		{
			no=happy(no);
		}
		if (no==1||no==7) {
			System.out.println("Happy Number !!");
		}else
			System.out.println("Not a Happy Number!!");
	}

	private static int happy(int no) {
		int sum=0;
		while (no!=0) {
			int rem = no%10;
			sum+=rem*rem;
			no/=10;
		}
		return sum;
	}
}
