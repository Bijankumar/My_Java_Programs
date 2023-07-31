package com.technoelevate.bigprogram;
/*	//Task 2:
Create a program that takes a list of Employee objects as input and performs the following operations:
Filter out all employees who have joined in the last 5 years
 and have a performance rating of less than 8, but have a salary between 60,000 and 120,000.
 
Sort the remaining employees in ascending order of their salaries, and then by their years of experience in descending order.
Return a new list containing the IDs of the remaining employees, but with each ID multiplied by 10.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Employee1 {
	private int id;
    private String name;
    private String department;
    private String jobTitle;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;
	public Employee1(int id, String name, String department, String jobTitle, int age, int yearsOfExperience,
			double salary, int performanceRating) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.age = age;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", department=" + department + ", jobTitle=" + jobTitle
				+ ", age=" + age + ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary
				+ ", performanceRating=" + performanceRating + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public int getAge() {
		return age;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public double getSalary() {
		return salary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
}

public class Task2 {
		public static void main(String[] args) {
			List<Employee1> list = Arrays.asList( new Employee1(102,"ram", "dev", "s.engineer", 25, 6, 65000, 5),
					 							  new Employee1(101,"sam", "test", "j.engineer", 23, 10, 90000, 3),
					 							  new Employee1(103,"mam", "dev", "j.engineer", 26, 8, 75000, 9),
					 							  new Employee1(104,"pani", "dev", "s.engineer", 22, 7, 58000, 8),
					 							  new Employee1(105,"raj", "test", "j.engineer", 25, 4, 68000, 7));

			list.stream().filter(e->!((e.getYearsOfExperience()<=5)&&(e.getSalary()>60000 && e.getSalary()<120000)&& e.getPerformanceRating()<8)).
			sorted(Comparator.comparing(Employee1::getSalary)).sorted(Comparator.comparing(Employee1::getYearsOfExperience).reversed()).forEach(System.out::println);
			System.out.println("\n");
			List<Integer> list2 = list.stream().filter(e->((e.getYearsOfExperience()<=5)&&(e.getSalary()>60000 && e.getSalary()<120000)&& e.getPerformanceRating()<8)).map(e->e.getId()*10).collect(Collectors.toList());
				System.out.println(list2);
		}
}
