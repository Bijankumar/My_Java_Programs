package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// Given a list of integers, find the average of all the numbers.

public class Find_Average_Fromlist {
	public static void main(String[] args) {
		List<Integer > list = Arrays.asList(12,13,17,11,7,10,8,6,16,22,9,25,45,15);
		// first we need to convert each element to permeative type
		//.average() --> gave you the average of all permeative values.
		
		double avg= list.stream().mapToInt(i->i).average().getAsDouble();
		System.out.println(avg);
		
		int averg = (int)list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(averg);
	}
}
