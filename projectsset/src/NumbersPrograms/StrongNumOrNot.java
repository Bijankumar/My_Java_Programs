package NumbersPrograms;
//Strong Number: Sum of factorial of each number is equal to itself.
public class StrongNumOrNot {
	static int num(int no)
	{
		int sum = 0;
		while (no!=0) {
			int rem = no%10;
			int fact = 1;
			for (int i = rem; i > 0; i--) {
				fact*=i;
			}
			sum+=fact;
			no/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int no = 145;
		int strong = num(no);
		if (no==strong) {
			System.out.println("It's a Strong Number !! ");
		}else {
			System.out.println("It's not a Strong Number");
		}
	}
}
