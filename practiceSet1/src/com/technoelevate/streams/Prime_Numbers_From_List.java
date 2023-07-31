package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Filter it out prime Numbers....

public class Prime_Numbers_From_List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 17, 22, 9, 25,7, 11);
		System.out.print("Prime Numbers :");
		Predicate<Integer> isPrime = n ->{
			for (int j = 2; j < n; j++) {
				if (n % j == 0)return false;
			}
			return true;
		};

		list.stream().filter(i -> isPrime.test(i)).map(i -> i + " ").forEach(System.out::print);
	}
}
