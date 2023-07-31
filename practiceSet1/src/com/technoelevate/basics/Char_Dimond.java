package com.technoelevate.basics;

public class Char_Dimond {
	public static void main(String[] args) {
		int n=5,space=n/2,star=1,count;
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");
			}
			count=i;
			for (int j = 1; j <=star; j++) {
				System.out.print(Math.abs(count--)+" ");
				if(count==0)count=i;
//				if(count>=j)count--;
			}
			if(i<n/2+1) {
				space--;
				star+=2;
			}else{
				space++;
				star-=2;
			}
			System.out.println();
		}
	}
}
