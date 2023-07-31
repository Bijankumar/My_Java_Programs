package NumbersPrograms;
//Happy No: Sum of square of each degit's of given number till getting single digit is equals to itself.
public class HappyNumOrNot {
	static int num(int no)
	{
		int sum=0;
		while (no!=0) {
			int rem = no%10;
			sum=sum+rem*rem;
			no/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int no =13;
		while (no>9) {
			no=num(no);
		}
		if (no==1||no==7) {
			System.out.println("Happy Number");
		}else{
			System.out.println("Not a Happy Number");
		}
	}
}
