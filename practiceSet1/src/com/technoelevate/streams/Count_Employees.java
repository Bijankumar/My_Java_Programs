package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;

// Count the employees ....
class Staff{
	String name;
	int age;
	
	public Staff(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class Count_Employees {
	public static void main(String[] args) {
		List<People> list = Arrays.asList(new People ("Chakra",24),new People ("Pani",28),
										  new People ("Pani",23),new People ("Pani",23),
										  new People ("Ram",25),new People ("Chakra",24),
										  new People ("Raj",26),new People ("Mam",23),
										  new People ("Mam",25),new People ("Pani",23),
										  new People("Ram",27),new People ("Chakra",23),
										  new People("Raj",25),new People ("Raj",22));	
		
		// count according to name...means How many employees in one name..
		
		long count = list.stream().filter(e->e.getName().equals("Chakra")).count();
		System.out.println(count);
		
		// count according to age...means how many employees in one age...
		
		long count2 = list.stream().filter(e->e.getAge()==23).count();
		System.out.println();
	}
}
