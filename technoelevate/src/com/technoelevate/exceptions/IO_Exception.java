package com.technoelevate.exceptions;

import java.util.Scanner;

public class IO_Exception {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String !!");
		int x= scanner.nextInt();
		System.out.println(x);
	}
}
