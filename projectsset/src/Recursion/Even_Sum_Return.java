package Recursion;

public class Even_Sum_Return {
	public static void main(String[] args) {
		System.out.println(evenSum(10));
	}
	
	private static int evenSum(int no) {
		if(no==0)
			return 0;
		else if(no%2==0)
			return no + evenSum(no-2);
		else
			return evenSum(no-1);
	}
}
