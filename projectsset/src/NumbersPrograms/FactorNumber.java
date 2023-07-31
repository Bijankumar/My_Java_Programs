package NumbersPrograms;

public class FactorNumber {
	public static void main(String[] args) {
		int no = 625;
		for (int i = 1; i <= no; i++) {
			if (no%i==0) {
				System.out.println(i);
			}
		}
	}
}
