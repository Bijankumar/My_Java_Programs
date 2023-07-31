package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
// Given a list of strings, find the count of strings that have length greater than 6.

public class Find_Length_Of_String {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("Bijan", "Chakra", "Pani", "Ganesh", "Pavitra");
		
	// .stream()--> converts list to stream
	// . filter()--> identify the condition satisfied elements and returns boolean type
	// .forEach()--> iterates each elements like loop
		
	list.stream().filter(i -> i.length()== 6).map(i -> i + " ").forEach(System.out::print);
  }
}
