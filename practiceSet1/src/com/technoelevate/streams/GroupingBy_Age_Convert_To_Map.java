package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group a list of people by their age and create a map where the key is the age 
// and the value is a list of people of that age.

class People{
	String name;
	int age;
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class GroupingBy_Age_Convert_To_Map {
	public static void main(String[] args) {
		List<People> list = Arrays.asList(new People ("Chakra",24),
											new People ("Pani",23),
											new People ("Ram",25),
											new People("Ram",25),
											new People("Raj",25));	
		
		List<Integer> collect2 = list.stream().map(e->e.getAge()).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		
		Map<Integer, List<People>> collect = list.stream().collect(Collectors.groupingBy(People::getAge));
		
 		collect.forEach((age,group)->System.out.println(age+" : "+group));
	}
	
}
