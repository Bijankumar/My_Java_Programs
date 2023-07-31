package MyPackage;

import java.util.Arrays;
import java.util.Comparator;

final class Employee{
	int age;
	String name;
	double sal;
	public Employee(int age, String name, double sal) {
		this.age = age;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return age+"::"+name+""+sal;
	}
}
class Test implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee a1 = (Employee)o1;
		Employee a2 = (Employee)o2;
		return a1.age-a2.age;
	}
}
public class Comparatorrr {
	public static void main(String[] args) {
		Employee e1 = new Employee(25, "Abc", 15000);
		Employee e2 = new Employee(30, "Pqr", 15050);
		Employee e3 = new Employee(40, "Xyz", 15000);
		Employee[]arr={e1,e2,e3};
		Arrays.sort(arr,new Test());
		for (Employee e : arr) {
			System.out.println(e);
		}
	}
}
