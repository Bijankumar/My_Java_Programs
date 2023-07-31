package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enetr value for Array ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(Prime(arr)));
	}

	private static int[] Prime(int arr[]) {
		ArrayList l1 = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1 && Check(arr[i]))
				l1.add(arr[i]);
		}
		int[] ans = { -1 };
		int res[] = new int[l1.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = (int) l1.get(i);
		}
		if (l1.size() == 0)
			return ans;
		else
			return res;
	}

	private static boolean Check(int arr) {
		for (int i = 2; i < arr / 2; i++) {
			if (arr % i == 0)
				return false;
		}
		return true;
	}
}
