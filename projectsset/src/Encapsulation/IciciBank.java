package Encapsulation;
//String stone design pattern.
class Icici{
	private static int psw=1256;
	public static int getP()
	{
		return psw;
	}
	
}
public class IciciBank {
	public static void main(String[] args) {
		Icici i = new Icici();
		System.out.println(i.getP());
	}
}
