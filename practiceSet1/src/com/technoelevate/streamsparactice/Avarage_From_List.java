package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.List;

// Write a Java program to calculate the average of a list of integers using streams.

public class Avarage_From_List {
	public static void main(String[] args) {
		List<Integer> list  =  Arrays.asList(1,25,42,10,22,30);
		 double avg = list.stream().mapToInt(e->e).average().getAsDouble();
		 System.out.println("Average : "+ avg);

		 long count = list.stream().count();
		 Integer reduce = list.stream().reduce(0,(a,b)->a+b);
		 System.out.println("Average : "+(reduce/count));
	}
}
