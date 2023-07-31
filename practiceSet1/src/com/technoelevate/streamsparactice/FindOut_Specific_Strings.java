package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.List;

// Write a Java program to count the number of strings in a list 
// that start with a specific letter using streams

public class FindOut_Specific_Strings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bijan", "Chakra", "Pani", "Ganesh", "Pavitra");
		list.stream().filter(e->e.startsWith("P")).map(e->e+" ").forEach(System.out::print);
	}
}
