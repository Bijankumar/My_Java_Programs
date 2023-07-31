package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Students{
	int id;
	String name;
	public Students(int id, String name) {
		this.id = id;
		this.name = name;
	}	
}

public class List_To_Map {
	public static void main(String[] args) {
		List<Students> stdlist = Arrays.asList(new Students(101, "Chakra"),
												new Students(102, "Pani"),
												new Students(103, "Ram"));
	Map<Integer, String> stdmap =stdlist.stream().collect(Collectors.toMap(s-> s.id, s-> s.name));
	
		System.out.println(stdmap);
	}
}
