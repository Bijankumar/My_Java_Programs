package MyPackage;

import java.util.Arrays;

public class Array_Even_Odd_Arrange {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 3, 6, 9, 11, 12 };
		Arrays.sort(arr);
		int[] ans = new int[arr.length];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1){
				ans[x] = arr[i];
				x++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0){
				ans[x]=arr[i];
				x++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
