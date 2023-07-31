package Recursion;

public class Sum_OF_Even_Numbers {
	public static void main(String[] args) {
		numbers(1,10);
		System.out.println(sum);
	}
	static int sum;
	private static void numbers(int no,int limit) {
		if(no<=limit) {
			if(no%2==0)
				sum+=no;
			numbers(no+1,limit);
		}
	}
}
