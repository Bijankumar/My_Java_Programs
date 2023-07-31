package com.technoelevate.collections30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Using_Comparable {
	public static void main(String[] args) {
		List list = Arrays.asList(16, 37, 85, 72, 25,15, 45,12, 63);
		
		// Collections.sort method internally uses Comparable interface for Sorting.
		Collections.sort(list);
	}
}
