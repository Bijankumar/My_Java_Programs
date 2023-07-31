package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;

//filter it out Even numbers...

public class EvenElements_FromList {
	public static void main(String[] args) {
		List<Integer > list = Arrays.asList(12,13,17,11,7,10,8,6,16,22,9,25,45,15);
		
		System.out.print("Even Numbers :");
		list.stream().filter(i-> i%2==0).map(i->i+" ").forEach(System.out::print);
	}
}
