package com.technoelevate.streamsparactice;

// Write a Java program to convert a list of strings to 
// uppercase or lowercase using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertTo_UpperOrLower {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bijan","Chakra","Pani","Ram");
		list.stream().map(e->e.toUpperCase()+" ").forEach(System.out::print);
		System.out.println();
		list.stream().map(e->e.toLowerCase()+" ").forEach(System.out::print);

	}
}
