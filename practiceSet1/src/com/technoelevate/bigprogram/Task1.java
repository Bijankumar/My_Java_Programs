package com.technoelevate.bigprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Task 1:
Implement a program that reads a list of Employee objects from the user 
and performs the following operations:

Filter out all employees-->
who are managers and have a salary greater than 100,000,but have joined in the last 3 years.

Sort the remaining employees in descending order of their years of experience, 
and then by their performance ratings in ascending order.

Return a new list containing the names of the remaining employees, but
with each name reversed and in uppercase.
 */
class Employe {
    private String name;
    private String department;
    private String jobTitle;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;
	public Employe(String name, String department, String jobTitle, int age, int yearsOfExperience, double salary,
			int performanceRating) {
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
		return "Employe [name=" + name + ", department=" + department + ", jobTitle=" + jobTitle + ", age=" + age
				+ ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary + ", performanceRating="
				+ performanceRating + "]";
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
public class Task1 {
	public static void main(String[] args) {
		List<Employe> list = Arrays.asList(new Employe( "pani","dev", "manager",27, 9,600000, 8),
										  new Employe( "mani","dev", "manager",27, 6,400000, 7),
										  new Employe( "nani","dev", "client",27,4, 50000, 3),
										  new Employe( "rani","dev", "manager",27, 3,500000, 7),
										  new Employe( "vani","dev", "developer",27, 7,300000, 6),
										  new Employe( "dani","dev", "client",27, 3,100000, 9));
		list.stream().filter(e->!((e.getSalary()>100000)&&(e.getYearsOfExperience()<=3)&&(e.getJobTitle().equals("manager")))).
		sorted(Comparator.comparing(Employe::getYearsOfExperience).reversed()).
		sorted(Comparator.comparing(Employe::getPerformanceRating)).forEach(System.out::println);
		System.out.println("\n");
		 list.stream().filter(e->(e.getSalary()>100000)&&(e.getYearsOfExperience()<=3)&&(e.getJobTitle().equals("manager"))).map(e->e.getName().toUpperCase()).
		map(e->new StringBuffer(e).reverse()).forEach(System.out::println);
	}
}
