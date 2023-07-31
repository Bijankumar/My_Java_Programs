package FinalMock;

public class Pattern {
	public static void main(String[] args) {
		String str = "Bijan";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i >= j)
					System.out.print(str.charAt(j) + " ");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
