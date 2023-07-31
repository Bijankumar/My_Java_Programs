package com.technoelevate.numbers;

public class Happy_Number {
	public static void main(String[] args) {
		int no = 23;
		no=happy(no);
		if(no==1||no==7)System.out.println("It's a Happy Number !!");
		else System.out.println("It's not a Happy Number !!");
	}
	private static int happy(int no) {
		if(no>9) {
		int sum=0;
		while(no!=0) {
			int rem = no%10;
			sum+=rem*rem;
			no/=10;
		}
		return happy(sum);
		}else return no;
	}
}
