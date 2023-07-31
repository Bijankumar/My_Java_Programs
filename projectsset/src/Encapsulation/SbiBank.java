package Encapsulation;
class Sbi
{
	private int psw=1245;

	public int getPsw() {
		return psw;
	}

	public void setPsw(int psw) {
		this.psw = psw;
	}
	
}
public class SbiBank {
	public static void main(String[] args) {
		Sbi s1= new Sbi();
		System.out.println("Your old Psw :"+s1.getPsw());
		s1.setPsw(5588);
		System.out.println("Your new Psw :"+s1.getPsw());
	}
}
