package com.technoelevate.collections30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Students_List implements Comparable<Sort_Students_List> {
	int id;
	String name;
	int age;
	public Sort_Students_List(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	 @Override
	public String toString() {
		return "Students_List [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	Comparable<Sort_Students_List> stu = o->this.age-o.age;
	 
	public static void main(String[] args) {
		List<Sort_Students_List> list = new ArrayList<>();
		list.add(new Sort_Students_List(101, "Chakra", 24));
		list.add(new Sort_Students_List(105, "Pani", 22));
		list.add(new Sort_Students_List(102, "Ram", 27));
		list.add(new Sort_Students_List(103, "Pavithra",25));
		list.add(new Sort_Students_List(104, "Rajnish",26));
		
		Collections.sort(list);
		
		for (Sort_Students_List s : list) {
			System.out.println(s);
		}
	}
	
//	Sorting Alphabetically.
	@Override
	public int compareTo(Sort_Students_List o) {
		return this.name.charAt(0)-o.name.charAt(0);
	}

	
	
}
