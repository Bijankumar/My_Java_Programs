package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Find the distinct characters present in a list of strings.

public class FindOut_Distinct_Characters {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bijan", "Chakra", "Pani", "Ganesh", "Pavitra");
		List<Character> collect = list.stream().flatMap(e -> e.chars().mapToObj(c->(char)c)).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
