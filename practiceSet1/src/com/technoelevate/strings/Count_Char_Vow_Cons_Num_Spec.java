package com.technoelevate.strings;

public class Count_Char_Vow_Cons_Num_Spec {
	public static void main(String[] args) {
		String str ="Chakra@Pani$500";
				str= str.toLowerCase();
				int cha = 0,vow = 0,con = 0,sp = 0,num = 0 ;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a'&&ch<='z') {
				cha++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')vow++;
				else con++;
			}
			else if(ch>='0'&&ch<='9') {
				num++;
			}
			else {
				sp++;
			}
		}
		System.out.println(" The total number of Charecters are : "+cha+
						   "\n Vowels :"+vow+"\n Consonants :"+con+
						   "\n Special Characters :"+sp+"\n Numbers :"+num);
	}
}
