package MyPackage;

import java.util.Scanner;

public class Numbers_of_Words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence !!");
		String str = sc.nextLine();
		int count;
		String[] srr = str.split(" ");
		for (int i = 0; i < srr.length; i++) {
			count = 1;
			for (int j = i + 1; j < srr.length; j++) {
				if (srr[i].equalsIgnoreCase(srr[j])) {
					srr[j] = "0";
					count++;
				}
			}
			if (count > 1 && srr[i] != "0") {
				System.out.println(srr[i] + "-->" + count);
			} else if(srr[i] != "0"){
				System.out.println(srr[i] + "-->" + count);
			}
		}
	}
}
