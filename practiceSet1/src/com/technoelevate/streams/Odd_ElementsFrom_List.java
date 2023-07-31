package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
// Filter it out odd numbers...
public class Odd_ElementsFrom_List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 17, 11, 9, 25, 45, 15);
		
		System.out.print("Odd Numbers :");
		list.stream().filter(i -> i % 2 != 0).map(i -> i + " ").forEach(System.out::print);

	}
}
