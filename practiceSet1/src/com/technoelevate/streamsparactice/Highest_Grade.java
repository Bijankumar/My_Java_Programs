package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Studentt{
	String name;
	char grade;
	public Studentt(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Studentt [name=" + name + ", grade=" + grade + "]";
	}
	public char getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}	
}
public class Highest_Grade {
	public static void main(String[] args) {
		List<Studentt> list = Arrays.asList(new Studentt("Pavithra", 'A'),
											new Studentt("Rajnish", 'D'),
											new Studentt("Ramganesh", 'E'),
											new Studentt("Chakra", 'B'));
//		list.stream().sorted(Comparator.comparing(Studentt::getGrade)).forEach(e->System.out.println(e+" "));
		System.out.println("Max Grade : "+list.stream().max(Comparator.comparing(Studentt::getGrade).reversed()).get());
	}
}