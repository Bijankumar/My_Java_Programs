package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;

public class ListOfStrings_Concatenatewith_Comma {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bijan", "Chakra", "Pani", "Ganesh", "Pavitra");
		list.stream().map(i->i+",").forEach(System.out::print);
	}
}
