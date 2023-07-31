package Arrays;

import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Password");
		char[]ch=sc.next().toCharArray();
		if (ch.length>=8) {
			int u=0,l=0,n=0,s=0;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i]>='A' && ch[i]<='Z') {
					u++;
				}else if (ch[i]>='a' && ch[i]<='z') {
					l++;
				}else if (ch[i]>='1' && ch[i]<='9') {
					n++;
				}else {
					s++;
				}
			}
//			if (u>=1 && l>=1 && n>=1 && s>=1 && ch[ch.length-1]=='#') {
			if (u>=1 && l>=1 && n>=1 && s>=1) {
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("Invalid Password");
		}
	}
}
