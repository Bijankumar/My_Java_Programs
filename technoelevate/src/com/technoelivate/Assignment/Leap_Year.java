package com.technoelivate.Assignment;
//	Check Leap Year
public class Leap_Year {
	public static void main(String[] args) {
		int year = 2023;
		if(year%4==0&&year%100!=0||year%400==0)
			System.out.println(year+" is a Leap Year !!");
		else
			System.out.println(year+" is not a Leap Year !!");

	}
}
