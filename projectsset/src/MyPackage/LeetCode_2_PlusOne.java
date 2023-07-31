package MyPackage;

import java.util.Arrays;

//	i/p --> [1,2,3]	or [9]
//	o/p --> [1,2,4]	or [1,0]

public class LeetCode_2_PlusOne {
	public static void main(String[] args) {
//		int arr[]= {1,2,3,9};
//		int arr[]= {9,8,7,6,5,4,3,2,1,9};
		int arr[]= {9,8,7,6,5,1,2,3,4,5,6,9};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(plusOne(arr)));
	}
	private static int[] plusOne(int[] arr) {
		if (arr.length==1) {
			arr[arr.length-1]+=1;
			String str=""+arr[arr.length-1];
			int[]arr2=new int[str.length()];
			for (int i = 0; i < str.length(); i++) {
				arr2[i]=str.charAt(i)-48;
			}
			return arr2;
		}else if (arr.length>1) {
			int x = 0;
			String str=""+(arr[arr.length-1]+1);
			int[]arr2=new int[arr.length+(str.length()-1)];
			for (int i = 0; i < arr.length-1; i++) {
				arr2[x]=arr[i];
				x++;
			}
			for (int i = 0; i < str.length(); i++) {
				arr2[x]=str.charAt(i)-48;
				x++;
			}
			return arr2;
		}
		return arr;
	}
}

