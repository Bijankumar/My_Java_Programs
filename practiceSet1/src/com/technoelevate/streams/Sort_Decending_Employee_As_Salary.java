package com.technoelevate.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

// Sort a list of employees based on their salaries in descending order.

class Employee{
	String name;
	int sal;
	public Employee(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	
}
public class Sort_Decending_Employee_As_Salary {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Chakra", 5000),
											new Employee("Pani", 5000),
											new Employee("Ram", 3000),
											new Employee("Chakra", 3000),
											new Employee("Ram",	3000),
											new Employee("Mam", 4000),
											new Employee("Chakra", 2000),
											new Employee("Ram", 4000),
											new Employee("Raj", 6000));
		list.stream().sorted(Comparator.comparing(Employee::getSal).reversed())
							.forEach(System.out::println);
		
	}
}
