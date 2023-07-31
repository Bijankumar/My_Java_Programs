package com.technoelevate.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Students{
	String name;
	String grade;
	public Students(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", grade=" + grade + "]";
	}
	String getGrade() {
		return grade;
	}
}
public class Find_High_Graded_Student {
	public static void main(String[] args) {
		List<Students> list = new ArrayList();
		list.add(new Students("Bijan","B"));
		list.add(new Students("Chakra", "A"));
		list.add(new Students("Pani", "B+"));
		list.add(new Students("Ram", "A+"));
		list.stream().forEach(System.out::println);
		System.out.println("\n");
		Students maxGrade = list.stream().min(Comparator.comparing(Students::getGrade)).get();
		System.out.print(maxGrade);
				
	}
}
