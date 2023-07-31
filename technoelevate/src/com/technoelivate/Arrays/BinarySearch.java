package com.technoelivate.Arrays;

class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int left = 0, right = arr.length, mid = 0, target = 6;
		while (left < right) {
			mid = (left + right) / 2;
			if (target == arr[mid]) {
				System.out.println(mid);
				break;
			} 
			else if (target < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
	}
}
