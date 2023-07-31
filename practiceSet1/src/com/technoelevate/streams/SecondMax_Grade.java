package com.technoelevate.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Sstudents{
	String name;
	String grade;
	public Sstudents(String name, String grade) {
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
public class SecondMax_Grade {
	public static void main(String[] args) {
		List<Sstudents> list = new ArrayList();
		list.add(new Sstudents("Bijan","B"));
		list.add(new Sstudents("Chakra", "A"));
		list.add(new Sstudents("Pani", "C"));
		list.add(new Sstudents("Ram", "D"));
		
		Sstudents students = list.stream().sorted(Comparator.comparing(Sstudents::getGrade)).skip(1).findFirst().get();
		System.out.println(students);
	}
}
