package Upper_Lower_Conversion;

import java.util.Scanner;

public class Case_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentense ");
		String[] str= sc.nextLine().toLowerCase().split(" ");
//		String str = "Rama and Sita Loved Each Other";
//		str = str.toLowerCase();
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 0) {
				String Srr = str[i],rev = "";
				for (int j = 0; j < Srr.length(); j++) {
					char ch = Srr.charAt(j);
					rev +=(char)(ch-32) ;
				}
				str[i] = rev;
			}
		}
//		System.out.println(Arrays.toString(strr));
//		System.out.print("Output--> ");
		for (String a : str) {
			System.out.print(a+" ");
		}
	}
}
