package com.technoelevate.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Flat_Map_Parctice {
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,5),
				Arrays.asList(2,4,6),Arrays.asList(5,4));
		List<Integer> list2 = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(list2);
	}
}
