package com.technoelivate.association;

import java.util.ArrayList;
import java.util.List;

class Teacher{
	String name;
	List<Students>list;
	public List<Students> getList() {
		return list;
	}

	public void setList(List<Students> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Students{
	List<Students> list;

	public List<Students> getList() {
		return list;
	}

	public void setList(List<Students> list) {
		this.list = list;
	}
	
}
public class One_Two_Many {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("Mangesh Sir");
		
		List<Students> list = new ArrayList<Students>();
//				list.add("Bijan");
//				list.add("Chakra Pani");
//				list.add("Rajnish");
//				list.add("Ram");
//				list.add("Pavithra");
		Students students = new Students();
			students.setList(list);
			
			System.out.println("Teacher Name :"+teacher.getName()+" \n"+"Students are :"+students.getList());
	}
}
