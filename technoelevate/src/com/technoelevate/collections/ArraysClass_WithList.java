package com.technoelevate.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysClass_WithList {
	public static void main(String[] args) {
		List list = Arrays.asList(1,5,3,5,2,1,5,4,2,1,1,2,1,5,2,1,5);
		System.out.println(Collections.frequency(list, 1));
		Collections.sort(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
}
