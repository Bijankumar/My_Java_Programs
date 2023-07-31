package com.technoelevate.numbers;

import java.util.Arrays;

public class FrequencyOfEachDigits {
	public static void main(String[] args) {
		int no = 12223566, count = 1,x=0;
		String str = "" + no;
		int[] arr = new int[str.length()];
		while (no != 0) {
			int rem = no % 10;
			arr[x++] = rem;
			no /= 10;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					count++;
				}
			}
			if (arr[i] != 0)
				System.out.println(arr[i] + "=>" + count);
		}
	}
}
