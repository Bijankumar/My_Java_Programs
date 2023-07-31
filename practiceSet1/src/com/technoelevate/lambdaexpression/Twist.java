package com.technoelevate.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Twist {
	public static void main(String[] args) {
		// A list of strings
		List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

		// Create a stream from the list
		Stream<String> stream = list.stream();

		// Filter out the strings that start with 'a' using a lambda expression
		Stream<String> filteredStream = stream.filter(s -> !s.startsWith("a"));

		// Convert the strings to upper case using a lambda expression
		Stream<String> upperCaseStream = filteredStream.map(s -> s.toUpperCase());

		// Print the strings using a lambda expression
		upperCaseStream.forEach(s -> System.out.println(s));

	}
}
