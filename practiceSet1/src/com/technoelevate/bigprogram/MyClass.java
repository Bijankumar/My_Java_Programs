package com.technoelevate.bigprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Create a program that takes a list of Employee objects as input and performs the following operations:
Filter out all employees : -> 
who have joined in the last 5 years and have a performance
rating of less than 8, but have a salary between 60,000 and 120,000.
Sort the remaining employees in ascending order of their salaries, and then
by their years of experience in descending order.
Return a new list containing the IDs of the remaining employees.*/

class Employee {
    private String name;
    private String department;
    private String jobTitle;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;
	public Employee(String name, String department, String jobTitle, int age, 
						int yearsOfExperience, double salary,int performanceRating) {
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.age = age;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
		this.performanceRating = performanceRating;
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", jobTitle=" + jobTitle + ", age=" + age
				+ ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary + ", performanceRating="
				+ performanceRating + "]";
	}
    
}
public class MyClass {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList( new Employee("ram", "dev", "s.engineer", 25, 6, 65000, 5),
			   								 new Employee("sam", "test", "j.engineer", 23, 10, 90000, 3),
			   								 new Employee("mam", "dev", "j.engineer", 26, 8, 75000, 9),
			   								 new Employee("pani", "dev", "s.engineer", 22, 7, 58000, 8),
			   								 new Employee("raj", "test", "j.engineer", 25, 4, 68000, 7));
//		List<Employee> collect = list.stream().filter(e->(e.getYearsOfExperience()<=5) && (e.getPerformanceRating()<8)&& ((e.getSalary()>60000)&&(e.getSalary()<120000))).collect(Collectors.toList());
//		
//		System.out.println("Match found \n"+collect +"\n");
//		// Find out the total salary.	
		Double reduce = list.stream().sorted(Comparator.comparing(Employee::getSalary)).map(e->(Double)e.getSalary()).reduce((double) 0,(a,b)->a+b);
			System.out.println(reduce);
		list.stream().filter(e->!((e.getYearsOfExperience()<=5) && (e.getPerformanceRating()<8)&& ((e.getSalary()>60000)&&(e.getSalary()<120000)))).
		sorted(Comparator.comparing(Employee::getSalary)).sorted(Comparator.comparing(Employee::getYearsOfExperience).reversed()).forEach(System.out::println);
			
	}
}
