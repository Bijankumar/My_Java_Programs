package com.technoelevate.bigprogram;

import java.util.Arrays;
import java.util.List;

/*Task 4:
Write a program that reads a list of Employee objects from the user and performs the following operations:
Filter out all employees :->
 who have a salary greater than 150,000 and are in the Engineering department, but have joined in the last 4 years.
Calculate the square root of the sum of the salaries of the remaining employees, but only for those who have a performance rating of at least 9.
Find the employee with the closest years of experience to the square root, but only if their age is less than 40.
*/
class JobHolder {
	String name;
	int age;
	int exp;
	int salary;
	double ratings;
	String dept;

	public JobHolder(String name, int age, int exp, int salary, double ratings, String dept) {
		this.name = name;
		this.age = age;
		this.exp = exp;
		this.salary = salary;
		this.ratings = ratings;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getExp() {
		return exp;
	}

	public int getSalary() {
		return salary;
	}

	public double getRatings() {
		return ratings;
	}

	public String getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "JobHolder [name=" + name + ", age=" + age + ", exp=" + exp + ", salary=" + salary + ", ratings="
				+ ratings + ", dept=" + dept + "]";
	}
}

public class Task4 {
	public static void main(String[] args) {
		List<JobHolder> list = Arrays.asList(new JobHolder("pani", 24, 5, 20000, 9.0, "degree"),
				new JobHolder("dani", 45, 7, 30000, 10.0, "engineering"),
				new JobHolder("vani", 56, 8, 25000, 8.0, "engineering"),
				new JobHolder("nani", 64, 4, 40000, 10.0, "degree"),
				new JobHolder("mani", 74, 9, 350000, 10.0, "engineering"));
		/*
		Filter out all employees :->
		who have a salary greater than 150,000 and are in the Engineering department,
		but have joined in the last 4 years.
		Calculate the square root of the sum of the salaries of the remaining employees, but only for those who have a performance rating of at least 9.
		Find the employee with the closest years of experience to the square root, but only if their age is less than 40.
		*/
		int reduce = list.stream().filter(e->!(e.getSalary()>150000 && e.getDept().equals("engineering")&& e.getExp()<4)).filter(e->e.getRatings()>=9).mapToInt(e->e.getSalary()).reduce(0,(a,b)->a+b);
		System.out.println("The Square root is : "+Math.sqrt(reduce));
		
		System.out.print("The Closest Y.O.E : ");
		list.stream().filter(e->e.getAge()<40).map(e->Math.round(Math.sqrt(e.getExp()))).forEach(System.out::println);
	}
}
