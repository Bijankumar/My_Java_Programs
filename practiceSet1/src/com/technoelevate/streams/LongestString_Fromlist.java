package com.technoelevate.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Given a list of strings, find the length of the longest string.

public class LongestString_Fromlist {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bijan", "Chakra", "Pani", "Ganesh", "Pavitra");
		
		// max()--> it will give the max length value by comparing all string value length
		
		String str=	list.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(str);
	}
}
