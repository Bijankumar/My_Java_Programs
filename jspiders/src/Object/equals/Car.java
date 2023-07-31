package Object.equals;

public class Car {
	String cname;
	double ccost;
	String ccol;
	Car(String cname,double ccost,String ccol){
		this.cname=cname;
		this.ccost=ccost;
		this.ccol=ccol;
	}
	public boolean equals(Object obj){
		Car c2 =(Car)obj;
		return this.ccol==c2.ccol ;
	}
	public static void main(String[] args) {
		Car c1 = new Car("Audi",50000.85,"Black");
		Car c2 = new Car("BMW",80000.85,"Black");
		System.out.println(c1.equals(c2));
	}
}
