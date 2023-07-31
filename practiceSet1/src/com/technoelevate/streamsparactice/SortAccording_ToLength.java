package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAccording_ToLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bijan", "Kumar", "Dey", "Chakrapani", "Ramganesh");
		Comparator<String> com = (s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			else if (s1.length() > s2.length())
				return 1;
			else
				return s1.compareTo(s2);
		};
		list.stream().sorted(com).forEach(e -> System.out.print(e + " "));
	}
}
