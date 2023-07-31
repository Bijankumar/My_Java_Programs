package NumbersPrograms;

public class PrimeFactors {
	public static void main(String[] args) {
		int no =4;
		int count=0;
		for (int i = 1; i <=no; i++) {
			if (no%i==0) {
				count++;
			}
		}
		if (count==2) {
			for (int j = 1; j <= no; j++) {
				if (no%j==0) {
					System.out.println(j);
				}
			}
		}else{
			System.out.println("It's not a Prime Number!!");
		}
	}
}
