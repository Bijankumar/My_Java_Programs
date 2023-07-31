package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.List;

//  Write a Java program to calculate the sum of all even,
//	odd numbers in a list using streams

public class Even_Sum_Odd_Sum {
	public static void main(String[] args) {
		List<Integer> list  =  Arrays.asList(1,25,42,10,22,30);
		
			Integer evenSum = list.stream().filter(e->e%2==0).reduce(0,(a,b)->a+b);
			System.out.println("Even Sum :"+evenSum);
			
			Integer oddSum = list.stream().filter(e->e%2!=0).reduce(0,(a,b)->a+b);
			System.out.println("Odd Sum :"+oddSum);
	}
}
