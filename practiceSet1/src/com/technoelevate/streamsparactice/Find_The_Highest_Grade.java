package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// Given a list of students, find the student with the highest grade.

class Students{
	String name;
	char grade;
	public Students(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}
	public char getGrade() {
		return grade;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", grade=" + grade + "]";
	}
	
}
public class Find_The_Highest_Grade {
	public static void main(String[] args) {
		List<Students> list = Arrays.asList(new Students("Bijan",'A'),
											new Students("Mam", 'C'),
											new Students("Pani", 'B'));
		Students collect = list.stream().max(Comparator.comparing(Students::getGrade).reversed()).get();
		System.out.println(collect);
	}
}
