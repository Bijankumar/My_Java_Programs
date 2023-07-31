package com.technoelevate.collections;

import java.util.Arrays;
import java.util.Comparator;

final class Staff{
	int id;
	String name;
	int age;
	public Staff(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
class Emp implements Comparator<Staff>{
	@Override
	public int compare(Staff o1, Staff o2) {
		return o1.id-o2.id;
	}
}

public class Managements {
	public static void main(String[] args) {
		Staff staff1 = new Staff(101,"Chakra",24);
		Staff staff2 = new Staff(103,"RamGanesh",27);
		Staff staff3 = new Staff(104,"Pavithra",28);
		Staff staff4 = new Staff(102,"Bijan",24);
		Staff []stf = {staff1,staff2,staff3,staff4};
		Arrays.sort(stf);
		for (Staff sta : stf) {
			System.out.println(sta);
		}
	}
}
