package com.technoelevate.numbers;

public class FibonacciSeries_Recursion {
	static int no1=0,no2=1,no3,limit = 10,count;
	public static void main(String[] args) {
//		System.out.print(no1+" "+no2+" ");
		count=2;
//		fibonacciSeries(no2);
		System.out.println(fiboo(5));
	}
	
	private static int fiboo(int no) {
		if(no==0)
			return 0;
		else if(no==1 || no==2)
			return 1;
		else
			return fiboo(no-1)+ fiboo(no-2);
				
	}

	private static void fibonacciSeries(int no) {
		if(count<limit) {
			no3=no1+no2;
			System.out.print(no3+" ");
			count++;
			no1=no2;
			no2=no3;
			fibonacciSeries(no2);
		}
	}
}
