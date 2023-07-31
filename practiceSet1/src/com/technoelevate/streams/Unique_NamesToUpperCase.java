package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;

// Given a list of names, create a new list-
// that contains only the unique names in uppercase?

public class Unique_NamesToUpperCase {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("Bijan", "Chakra", "Pani", "Ram", "Pavitra", "Chakra", "Pani","Raj");
	
	//distinct()--> filters unique elements only
	list.stream().distinct().map(i->i.toUpperCase()+" ").forEach(System.out::print);
	}
}
