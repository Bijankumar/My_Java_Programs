package com.technoelevate.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Find_Max_Min_FromDouble_List {
	public static void main(String[] args) {
		List<Double > list = Arrays.asList(12.55,13.75,17.42,11.36,7.222);
		
	//  max()--> it will compare each elements one by one which is maximum.
	//	min()--> it will compare each elements and filter it out minimum.
		
		Double max1 = list.stream().max(Comparator.comparing(Double::doubleValue)).get();
		System.out.println(max1);
										//or
		
		double max = list.stream().max(Comparator.comparingDouble(e->e)).get();
		System.out.println(max);
		
		//=========================================================//
		
		Double min1 = list.stream().min(Comparator.comparing(Double::doubleValue)).get();
		System.out.println(min1);
										//or
		
		double min = list.stream().min(Comparator.comparingDouble(e->e)).get();
		System.out.println(min);
	}
}
