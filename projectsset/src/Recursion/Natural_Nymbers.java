package Recursion;

public class Natural_Nymbers {
	public static void main(String[] args) {
		numbers(1);
	}
	private static void numbers(int no) {
		if(no<=10) {
			System.out.println(no);
		numbers(no+1);
		}
	}
}
