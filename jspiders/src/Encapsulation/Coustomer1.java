package Encapsulation;

class Phonepay{
	private int amt = 50000;

	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
}
public class Coustomer1 {
public static void main(String[] args) {
	Phonepay p1=new Phonepay();
	System.out.println(p1.getAmt());
}
}
