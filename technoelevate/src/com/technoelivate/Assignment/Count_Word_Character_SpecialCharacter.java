package com.technoelivate.Assignment;

import java.util.Arrays;

//	Count Vowels, Characters, Consonants, Special Characters, Word   

//	Count from given string

public class Count_Word_Character_SpecialCharacter {
	public static void main(String[] args) {
		String str = "Techno@9 Elevate!!";
			   str = str .toLowerCase();
			   
		int sum = 0, vowel = 0, consonants = 0,numbers=0,specialCharacter = 0;
		String[] srr = str.split(" ");
		System.out.println("Given String is : "+str+"\n");
		
		int[] arr = new int[122];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowel++;
				else
					consonants++;
			}else if (ch>=0 && ch<=9)
				numbers++;
			else if (ch != ' ')
				specialCharacter++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && (char) i != ' ')
				sum += arr[i];
		}

		System.out.println("The Number of Words are : " + srr.length);
		System.out.println("The Number of Charcters are : " + sum);
		System.out.println("The Number of Vowels are : " + vowel);
		System.out.println("The Number of Consonants are : " + consonants);
//		System.out.println("The Number of SpecialCharacters are : " + specialCharacter);
//		System.out.println("The Number of Numbers are : " + numbers);
	}
}
