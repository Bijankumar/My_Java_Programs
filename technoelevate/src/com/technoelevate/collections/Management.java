package com.technoelevate.collections;

import java.util.Arrays;

class Employee implements  Comparable<Employee>{
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee employee) {
		return this.id-employee.id;	
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	
}
class Management{
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Dinesh", 24);
		Employee e2 = new Employee(103,"Bijan",25);
		Employee e3 = new Employee(102,"Gowtham",27);
		Employee []list = {e1,e2,e3};
		Arrays.sort(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}