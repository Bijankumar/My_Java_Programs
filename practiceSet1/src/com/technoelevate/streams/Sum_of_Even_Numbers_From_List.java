package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Find the sum of all even numbers from a list of integers.

public class Sum_of_Even_Numbers_From_List {
	public static void main(String[] args) {
	List<Integer > list = Arrays.asList(12,13,17,11,7,10,8,6,16,22,9,25,45,15);
	
	// .reduce() --> method used to reduce the length of the elements to single value
	// like -->> sum,multiplication..all operations.
	
	int sum= list.stream().filter(i->i%2==0).reduce(0,(a,b)->a+b);
	System.out.println(sum);
	
	Optional<Integer> res= list.stream().filter(i->i%2==0).reduce(Integer::sum);
	System.out.println(res);
	
	}
}
