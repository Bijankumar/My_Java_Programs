import java.util.Scanner;

public class CountDuplicateChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yor String");
		char[] ch = sc.next().toLowerCase().toCharArray();
		int count;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = 0;
				}
			}
			if (count > 1 && ch[i] != 0) {
				System.out.println(ch[i] + "=" + count);
			}
//			else if (count == 1 && ch[i] != 0)
//				System.out.println(ch[i]);
		}
	}
}
