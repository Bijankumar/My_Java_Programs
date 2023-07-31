package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_Samllest_Largest_FromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,25,42,10,22,30);
		Integer maxInt = list.stream().max((o1, o2) ->(o1>o2)? 1:-1).get();
		Integer minInt = list.stream().min((o1, o2) ->(o1<o2)?-1: 1).get();
		
		System.out.println(maxInt);
		System.out.println(minInt);
		
		Integer secSmallest = list.stream().sorted().skip(1).findFirst().get();
		Integer secLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secSmallest);
		System.out.println(secLargest);
	}
}
