package Upper_Lower_Conversion;

import java.util.Arrays;
import java.util.Scanner;

public class Case_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentense ");
		String[] str= sc.nextLine().toLowerCase().split(" ");
//		String str = "Rama Went to Honymoon";
//		str=str.toLowerCase();
//		String Strr[]=str.split(" ");
		for (int i = 0; i < str.length; i++) {
			String srr=str[i],rev="";
			for (int j = 0; j < srr.length(); j++) {
				char ch = srr.charAt(j);
				if(j==0||j==srr.length()-1)
					rev+=ch;
				else
					rev+=(char)(ch-32);
			}
			str[i]=rev;
		}
//		System.out.println(Arrays.toString(Strr));
//		System.out.print("Output--> ");
		for (String a : str) {
			System.out.print(a+" ");
		}
	}
}
