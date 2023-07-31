package com.technoelevate.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class StudentList implements Comparable<StudentList>{
	String name;
	int id ;
	int yoA;
	public StudentList(int id,String name , int yoA) {
		this.name = name;
		this.id = id;
		this.yoA = yoA;
	}
	
	@Override
	public String toString() {
		return "StudentList [name=" + name + ", id=" + id + ", yoA=" + yoA + "]";
	}
	
	@Override
	public int compareTo(StudentList o) {
		return this.id-o.id;	// sorting as Id...
//		return this.yoA-o.yoA;	// Sorting As Year of admission..
//		return this.name.charAt(0)-o.name.charAt(0);// Sorting As name..
	}
}

public class Comparable_Test {
	public static void main(String[] args) {
		List<StudentList> list = Arrays.asList(new StudentList(101,"Bijan",2016),
												new StudentList(104, "Chakra", 2014),
												new StudentList(105, "Ram", 2013),
												new StudentList(102, "Raj", 2018),
												new StudentList(103, "Mam",2017));
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
