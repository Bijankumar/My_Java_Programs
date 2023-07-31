package MyPackage;

import java.util.Arrays;
import java.util.Objects;

public class Employeees implements Comparable{
	int id;
	String name;
	double sal;
	public Employeees(int id,String name,double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int compareTo(Object o){
		Employeees e = (Employeees)o;
		return this.id-e.id;//Ascending Order
//		return e.id-this.id;//Decending Order
	}
	public String toString(){
		
		return (id+"::"+name+"::"+sal);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name,sal);
	}
	public static void main(String[] args) {
		Employeees e1 =new Employeees(10, "Abc", 10000);
		Employeees e2 =new Employeees(101, "Pqr", 10500);
		Employeees e3 =new Employeees(101, "Xyz", 10800);
		Employeees[]arr={e1,e2,e3};
		Arrays.sort(arr);
		for (Employeees a : arr) {
			
			System.out.println(a);
			System.out.println(a.hashCode());
		}
		
	}
}
