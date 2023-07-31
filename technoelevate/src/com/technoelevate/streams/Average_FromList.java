package com.technoelevate.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Average_FromList {
	public static void main(String[] args) {
		
		// Given a list of integers, find the average of all the numbers.
		List<Integer> list  =  Arrays.asList(1,25,42,10,22,30);
		System.out.println("Average :"+ list.stream().mapToInt(e->e).average().getAsDouble());
		
		// Given a list of strings, find the count of strings that have length greater than 5.
		List<String> list1  =  Arrays.asList("Bijan","Ranjan","Anjan","Rajnish","ChakraPani");
		System.out.println("Count is : "+ list1.stream().filter(e->e.length()>5).count());

		//Find the sum of all even numbers from a list of integers.
		List<Integer> list3  =  Arrays.asList(1,25,42,10,22,30);
		System.out.println("Even sum :"+ list3.stream().filter(e->e%2==0).reduce(0,(a,b)->a+b));
		
		//Given a list of names, create a new list that contains only the unique names in uppercase.
		List<String> list4  =  Arrays.asList("Bijan","Anjan","Bijan","Ranjan","ChakraPani");
		list4.stream().distinct().map(e->e.toUpperCase()+" ").forEach(System.out::print);
		
		// Remove all duplicates from a list of integers.
		List<Integer> list5  =  Arrays.asList(1,25,42,10,22,30,1,25,42);
		System.out.print("\nDuplicates Removed : ");
		list5.stream().distinct().map(e->e+" ").forEach(System.out::print);

		System.out.println();
		// Given a list of strings, concatenate them into a single string, separated by a comma.
		List<String> list6  =  Arrays.asList("Bijan","Ranjan","Anjan","Rajnish","ChakraPani");
		list6.stream().map(e->e+",").forEach(System.out::print);
		
		//Given a list of numbers, find the product of all the numbers using the reduce() method.
		List<Integer> list7  =  Arrays.asList(1,25,42,10);
		System.out.println("\nProduct : "+list7.stream().reduce(1,(a,b)->a*b).longValue());

		//Find the maximum and minimum values from a list of doubles.
		List<Integer> list8  =  Arrays.asList(1,25,42,10,22,30,1,65,42);
		System.out.println("Max Value :"+ list8.stream().max(Comparator.comparing(Integer::intValue)).get());
		System.out.println("Max Value :"+ list8.stream().min(Comparator.comparing(Integer::intValue)).get());

		
	}
}
