package MyPackage;

public class Patterns {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i+j==n/2+2||i+j==n+n/2+1||i-j==n/2||j-i==n/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

