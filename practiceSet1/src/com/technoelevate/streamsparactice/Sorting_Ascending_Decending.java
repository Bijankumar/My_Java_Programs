package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Write a Java program to sort a list of strings in alphabetical order,
// ascending and descending using streams
public class Sorting_Ascending_Decending {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Pavitra","Bijan", "Chakra", "Pani", "Ganesh");
		// Ascending Order
		list.stream().sorted().map(e->e+" ").forEach(System.out::print);
		
		System.out.println();
		
		// Decending Order
		list.stream().sorted(Comparator.reverseOrder()).map(e->e+" ").forEach(System.out::print);
	}
}
