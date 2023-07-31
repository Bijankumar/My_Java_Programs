package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
//Given a list of numbers, find the product of all the numbers using the reduce() method.

public class Find_TheProduct_From_List {
	public static void main(String[] args) {
		List<Integer > list = Arrays.asList(12,13,6,5,10,15,15,55);
		
		Integer reduced = list.stream().reduce(1,(i,j)->i*j);
		System.out.println(reduced);
	}
}
