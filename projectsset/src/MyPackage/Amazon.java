package MyPackage;
//Compile time PolyMorphism
public class Amazon {
	static void Order(){
		System.out.println("Do Order...");
	}
	static void Order(String s){
		System.out.println("Do Order..."+s);
	}
	static void Order(int amt){
		System.out.println("pay money..."+amt);
	}
	static void Order(String x,int amt){
		System.out.println("Order Placed....");
	}
	public static void main(String[] args) {
		Order();
		Order("Mobile");
		Order(5000);
		Order("Mobile",5000);
	}
}
