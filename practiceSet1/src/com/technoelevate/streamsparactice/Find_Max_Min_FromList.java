package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find the maximum and minimum values from a list of doubles.

public class Find_Max_Min_FromList {
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(45.45,12.45,12.78,20.333,25.33,2.568);
		Double max = list.stream().max(Comparator.comparing(e->e)).get();
		Double min = list.stream().min(Comparator.comparing(e->e)).get();
		
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
	}
}
