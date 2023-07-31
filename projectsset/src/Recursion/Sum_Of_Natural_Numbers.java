package Recursion;

public class Sum_Of_Natural_Numbers {
	public static void main(String[] args) {
		numbers(1);
		System.out.println(sum);
	}
	static int sum;
	private static void numbers(int no) {
		if(no<=10) {
			sum+=no;
			numbers(no+1);
		}			
	}
}
