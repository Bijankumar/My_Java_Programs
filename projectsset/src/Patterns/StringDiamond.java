package Patterns;

import java.util.Scanner;

public class StringDiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		char[] ch = sc.next().toCharArray();
		int no = ch.length;
		int star =1,space =no/2,x;
		for (int i = 1; i <= ch.length; i++) {
			x=0;
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(ch[x]+" ");
				x++;
			}
			System.out.println();
			if (i<no/2+1) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
		}	
	}
}
