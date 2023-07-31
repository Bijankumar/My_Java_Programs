package com.technoelevate.streams;
// Given a list of integers, find the second smallest number.

import java.util.Arrays;
import java.util.List;

public class Second_Smallest_Element_FromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,55,4,20,5);
		Integer integer = list.stream().sorted().skip(1).findFirst().get();
		System.out.println(integer);
	}
}
