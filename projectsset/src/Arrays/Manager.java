package Arrays;

import java.util.Arrays;

class Employee implements Comparable {
	int id;
	int age;
	String name;

	public Employee(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int compareTo(Object o) {
		Employee q = (Employee) o;
		return this.id - q.id;
	}

	@Override
	public String toString() {

		return ("Employee id ="+id+",age="+age+",name="+name);
	}

}

public class Manager {
	public static void main(String[] args) {
		Employee e2 = new Employee(105, 45, "Chandan");
		Employee e3 = new Employee(107, 30, "Raju");
		Employee e1 = new Employee(101, 35, "Bijan");
		Employee[]arr={e1,e2,e3};
		Arrays.sort(arr);
		for (Employee e : arr) {
			System.out.println(e);
		}


	}
}
