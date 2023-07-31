package com.technoelevate.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Given a list of strings, find the three longest strings in the list.

public class Longest_3_From_List_Of_Strings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bijan", "Chakra", "Pani", "Ganesh", "Pavitra");
		list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).forEach(System.out::println);
	}
}
