package com.technoelivate.Assignment;
// WordCount

//	i/p	: Techno Elevate
//	o/p	: Techno6 Elevate7

public class Word_Count {
	public static void main(String[] args) {
		String str = "Techno Elevate Bijan Kumar";
		int sum=0;
		String [] srr = str.split(" ");
		System.out.println("The no of Words are :"+srr.length);
		int [] count = new int[122];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				count[ch]++;
		}
		for (int i = 0; i < count.length; i++) {
			sum+=count[i];			
//			if(count[i]!=0)
//			System.out.println((char)i+"==>"+count[i]);
		}
		System.out.println("The total no of character is : "+sum);

	}
}
