package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.List;

// Write a Java program to remove all duplicate elements from a list using streams.

public class Remove_Duplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,12,25,2,5,15,10,12,25,2);
		list.stream().distinct().map(e->e+" ").forEach(System.out::print);
	}
}
