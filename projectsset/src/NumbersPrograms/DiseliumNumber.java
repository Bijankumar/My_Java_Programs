package NumbersPrograms;

import java.util.Scanner;
//Diselium Number: the sum of power(based on digit's position) of each digit is equal to given number.
public class DiseliumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numaber :");
		int no = sc.nextInt();
		int sum =0,copy=no;
		while (no!=0) {
			int base = no%10;
			sum=sum+power(base,count(no));
			no/=10;
		}
		if (copy==sum) {
			System.out.println("It is a Diserium Number !!");
		}else {
			System.out.println("it is not a Diserium Number !!");
		}
	}
	static int count(int no){
		int count =0;
		while (no!=0) {
			no=no/10;
			count++;
		}
		return count;
	}
	static int power(int base,int exp){
		int ans = 1;
		while (exp!=0) {
			ans*=base;
			exp--;
		}
		return ans;
	}
}
