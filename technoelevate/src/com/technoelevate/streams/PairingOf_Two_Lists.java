package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairingOf_Two_Lists {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(5, 2);
		
		List<List<Integer>> list3 = list1.stream().flatMap(i -> list2.stream().map(j -> Arrays.asList(i,j)))
				.collect(Collectors.toList());
		System.out.println(list3);
		List<List<Integer>> collect = list1.stream().flatMap(i->list2.stream().map(j->Arrays.asList(i,j))).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
