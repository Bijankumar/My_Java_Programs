package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// find out the duplicate elements present in list.

public class Remove_Duplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,25,42,10,22,30,1,25,42);
		// indexOf()--> returns 1st presence index value of given object in the list.
		// lastIndexOf() --> returns the last time presence of the particular object in the list.
		
		// if both are not equals means same object present in both the indexes so it is duplicate value.
		
		List<Integer> collect = list.stream().filter(e->list.indexOf(e)!=list.lastIndexOf(e)).collect(Collectors.toList());
			System.out.println(collect);
	}
}