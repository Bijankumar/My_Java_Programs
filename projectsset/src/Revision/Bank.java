package Revision;
class Bank1 {
	private int atm = 1234;
	public int getAtm() {
		return atm;
	}
	public void setAtm(int atm) {
		this.atm = atm;
	}
}
public class Bank {
	public static void main(String[] args) {
		Bank1 b1 = new Bank1();
		System.out.println(b1.getAtm());
		b1.setAtm(1256);
		System.out.println(b1.getAtm());
	}
}