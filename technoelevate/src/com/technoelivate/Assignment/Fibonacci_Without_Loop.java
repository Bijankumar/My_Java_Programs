package com.technoelivate.Assignment;

// Fibonacci series without loop (0,1,1,2,3,5,8...)

public class Fibonacci_Without_Loop {
	static int no1 = 0, no2 = 1, no3, limit = 21;

	public static void main(String[] args) {
		System.out.print(no1 + " " + no2 + " ");
		fibonacci(no2);
//		System.out.print(fibo(5));
	}

//	public static int fibo(int no) {
//		if(no==0)return 0;
//		else if(no==1||no==2)return 1;
//		else return fibo(no-1)+fibo(no-2);
//	}
		
	private static void fibonacci(int no2) {
		if (no2 > 0 && no2 < limit) {
			no3 = no1 + no2;
			if (no3 <= limit) {
				System.out.print((no3) + " ");
				no1 = no2;
				no2 = no3;
				fibonacci(no2);
			}
		}
	}
}
