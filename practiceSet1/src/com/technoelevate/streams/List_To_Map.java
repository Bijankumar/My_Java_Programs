package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Convert a list of objects to a map, using a specific attribute as the key.

class Studentss{
	int id;
	String name;
	public Studentss(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}

public class List_To_Map {
	public static void main(String[] args) {
		List<Studentss> stdlist = Arrays.asList(new Studentss(101, "Chakra"),
												new Studentss(102, "Pani"),
												new Studentss(103, "Ram"));
	Map<Integer, String> stdmap =stdlist.stream().collect(Collectors.toMap(s-> s.id, s-> s.name));
	System.out.println(stdmap);
	
	Map<Integer, String> stds = stdlist.stream().collect(Collectors.toMap(Studentss::getId, Studentss::getName));
	System.out.println(stds);
	}
}
