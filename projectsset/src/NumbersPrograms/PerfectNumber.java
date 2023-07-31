package NumbersPrograms;
// Perfect no: Sum of each individual's factor is equal to itself.
public class PerfectNumber {
	public static void main(String[] args) {
		int no = 28,sum=0;
		for (int i = 1; i <= no/2; i++) {
			if (no%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		if (sum==no) {
			System.out.println(no+" is Perfect Number");
		}else{
			System.out.println(no+" Not a Perfect Number");
		}
	}
}
