package com.technoelevate.bigprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*Task 5:
Implement a program that takes a list of Employee objects as input and performs the following operations:
Filter out all employees who have less than 3 years of experience and
 are not in the IT department, but have a performance rating of at least 8.
Sort the remaining employees in descending order of their performance ratings, and then by their years of experience in ascending order.
Return a new list containing the names of the remaining employees, but with each name reversed, in lowercase, and suffixed with their age.*/
class Slave {
	String name;
	int age;
	double ratings;
	String dept;
	int exp;

	public Slave(String name, int age, double ratings, String dept, int exp) {
		this.name = name;
		this.age = age;
		this.ratings = ratings;
		this.dept = dept;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getRatings() {
		return ratings;
	}

	public String getDept() {
		return dept;
	}

	public int getExp() {
		return exp;
	}

	@Override
	public String toString() {
		return "Slave [name=" + name + ", age=" + age + ", ratings=" + ratings + ", dept=" + dept + ", exp=" + exp
				+ "]";
	}
}

public class Task5 {
	public static void main(String[] args) {
		List<Slave> list = Arrays.asList(new Slave("Pani", 24, 9.0, "engineering", 3),
										 new Slave("Nani", 25, 7.0, "it", 5),
										 new Slave("Mani", 26, 5.0, "it", 4),
										 new Slave("Vani", 27, 7.0, "engineering", 7),
										 new Slave("Rani", 29, 3.0, "engineering", 8));
	/*
	Filter out all employees who have less than 3 years of experience and
	are not in the IT department, but have a performance rating of at least 8.
	Sort the remaining employees in descending order of their performance ratings, and then by their years of experience in ascending order.
	Return a new list containing the names of the remaining employees, but with each name reversed, in lower case, and suffixed with their age.
	*/
		list.stream().filter(e->!(e.getExp()<3 )&&!(e.getDept().equals("it"))&& !(e.getRatings()>=8)).sorted(Comparator.comparing(Slave::getRatings).reversed())
							.sorted(Comparator.comparing(Slave::getExp)).map(e-> new StringBuffer(e.getName().toLowerCase()).reverse()+" "+e.getAge()).forEach(System.out::println);

	}
}
