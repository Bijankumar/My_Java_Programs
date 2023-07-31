package Upper_Lower_Conversion;

import java.util.Arrays;
import java.util.Scanner;

public class Case_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentense ");
		String[] str= sc.nextLine().toLowerCase().split(" ");
//		String str = "Hii im Groot";
//		str = str.toLowerCase();
//		String[] strr = str.split(" ");
		for (int i = 0; i < str.length; i++) {
			String srr = str[i], rev = "";
			for (int j = 0; j < srr.length(); j++) {
				char ch = srr.charAt(j);
				if (j > 0)
					rev += (char) (ch - 32);
				else
					rev += ch;

			}
			str[i] = rev;
		}
//		System.out.println(Arrays.toString(strr));
//		System.out.print("Output--> ");
		for (String a : str) {
			System.out.print(a+" ");
		}
	}
}
