package MyPackage;

import java.util.Arrays;

//	i/p --> [1,2,3]	or [9]
//	o/p --> [1,2,4]	or [1,0]

public class LeetCode_PlusOne_Array {
	public static void main(String[] args) {
//		int arr[]= {1,2,3};
		int arr[]= {0};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(plusOne(arr)));
	}
	private static int[] plusOne(int[] arr) {
		arr[arr.length-1]+=1;
		if (arr.length==1) {
			
			String str=""+arr[arr.length-1];
			int[]arr2=new int[str.length()];
			for (int i = 0; i < str.length(); i++) {
				arr2[i]=str.charAt(i)-48;
			}
			return arr2;
		} 
		return arr;
	}
}
