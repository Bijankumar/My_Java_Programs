package com.technoelevate.collections30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_Using_Comparator {

	public static void main(String[] args) {
		List list = Arrays.asList(16, 37, 85, 72, 25,15, 45,12, 63);
		System.out.println(list);

		// sort by using Comparator
		Comparator<Integer> com = (i, j) -> (i  > j ) ? 1 : -1;
		
		Collections.sort(list, com);
		System.out.println(list);
		
		
		Comparator<Integer> com1 = (i, j) -> (i % 10 > j % 10) ? 1 : -1;

		Collections.sort(list, com1);
		System.out.println(list);

		Comparator<Integer> com2 = (i, j) -> (i / 10 > j / 10) ? 1 : -1;
		
		Collections.sort(list, com2);
		System.out.println(list);
	}
}
