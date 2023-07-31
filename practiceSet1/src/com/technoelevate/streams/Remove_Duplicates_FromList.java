package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;

public class Remove_Duplicates_FromList {
	public static void main(String[] args) {
		List<Integer > list = Arrays.asList(12,13,17,11,7,10,8,6,12,13,17,11,7,15);

		System.out.print("After Removing Duplicates :");
		list.stream().distinct().map(i->i+" ").forEach(System.out::print);;

	}
}
