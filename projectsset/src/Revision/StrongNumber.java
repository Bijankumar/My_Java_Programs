package Revision;

import java.util.Scanner;

public class StrongNumber {
	static int sum =0;
	public static int num(int n)
	{
		while(n!=0){
			int rem = n%10;
			int fact =1;
			for (int i = rem; i > 0; i--) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		/*int n=145,sum = 0,fact,copy=n;
		while (n!=0) {
			int rem = n%10;
			fact=1;
			for (int i = rem; i > 0; i--) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if (sum==copy) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not A Strong Number");
		}*/
		int n = sc.nextInt();
		int res=num(n);
		if (n==res) {
			System.out.println("Strong");
		}else {
			System.out.println("not a Strong");
		}
	}
}
