package com.technoelevate.numbers;

public class Xylem_PhloemNumber {
	public static void main(String[] args) {
		int no = 121,isum = 0,osum = 0,copy=no;
		while(no!=0) {
			if(no==copy||no<10)osum+=no%10;
			else isum+=no%10;
			no/=10;
		}
		
		if(isum==osum)
			System.out.println("It's a Xylem Number !!");
		else
			System.out.println("Its's a Phloem Number !!");
	}
}
