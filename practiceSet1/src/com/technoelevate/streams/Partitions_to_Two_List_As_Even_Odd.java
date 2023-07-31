package com.technoelevate.streams;

//Partition a list of integers into two lists, one containing even numbers and 
// the other containing odd numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Partitions_to_Two_List_As_Even_Odd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,15,4,20,5,8,20,16,18);
		
		List<Integer> evenList = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		
		System.out.println("Even List: "+evenList);
		System.out.println("Odd List: "+oddList);
	}
}
