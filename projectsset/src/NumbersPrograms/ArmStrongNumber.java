package NumbersPrograms;
import java.util.Scanner;
// Arm-Strong Number :(Ex-153)
//		Sum of each degit's power(based on no. of digit's present in number) is equal to itself.
public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number :");
		int no = sc.nextInt();
		int copy = no, sum = 0;
		while (no != 0) {
			int base = no % 10;
			sum = sum + power(base, count(copy));
			no /= 10;
		}
		if (sum == copy)
			System.out.println(copy + " It's A Arm Strong Number !!");
		else 
			System.out.println(copy + " It's not A Arm Strong Number !!");
	}
	static int count(int no) {
		int count = 0;
		while (no != 0) {
			no = no / 10;
			count++;
		}
		return count;
	}
	static int power(int base, int exp) {
		int ans = 1;
		while (exp != 0) {
			ans *= base;
			exp--;
		}
		return ans;
	}
}