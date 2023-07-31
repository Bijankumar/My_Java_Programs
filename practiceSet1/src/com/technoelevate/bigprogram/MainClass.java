package com.technoelevate.bigprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

//given a list of students having attributes like student name, student id,
//student age, student subject marks[map-subjects are keys and marks are values], student gender 

//update the percentage of math subject who  are female by gender and 
//having age more than 23 by 15% of  the original marks.

//the subject are 
//math English science social 
//these subjects and their values are stored in a map wanted by the variable by student subject marks
interface sam{
	public default void d() {
		
	}
}
class Student{
	private int id;
	private String name;
	private String gender;
	private int age;
	Map<String, Integer> subMark;
	
	public Student(int id, String name,String gender, int age, Map<String, Integer> subMark) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.subMark = subMark;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public Map<String, Integer> getSubMark() {
		return subMark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", subMark=" + subMark + "]";
	}
}

public class MainClass {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("english", 75);
		map1.put("science", 70);
		map1.put("math", 60);
		map1.put("social", 70);
		map1.put("hindi", 85);

	
		
		List<Student> list = Arrays.asList(new Student(101, "ram","male", 25, map1),
										   new Student(105, "mam","female", 27, map1),
										   new Student(103, "chakra","male", 24, map1),
										   new Student(102, "sita","female", 25, map1));
		  List<Double> collect = list.stream().filter(e->e.getGender().equals("female")&& e.getAge()>=23).
		map(e->e.subMark.get("math")+0.15*e.subMark.get("math")).collect(Collectors.toList());
		
		 
//		  list.stream().filter(e->e.getGender().equals("female")&& e.getAge()>=23).filter(e->e.getSubMark().containsKey("math")).map(e->(e.subMark.get("math")+(+0.15*e.subMark.get("math")))).forEach(System.out::println);
	System.out.println();
	}
	public static double updatedMark(int no) {
		no+=no*0.15;
		return no;
	}
}
