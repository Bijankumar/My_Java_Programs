package Arrays;

import java.util.Arrays;

public class Array_Palindrome {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1};
		int rev[]=new int[arr.length];int x=0;
		for (int i = arr.length-1; i >=0 ; i--) {
			rev[x]=arr[i];
			x++;
		}
		System.out.println("Input    -->"+Arrays.toString(arr));
		System.out.println("Resultant-->"+Arrays.toString(rev));
		if(Arrays.equals(rev,arr))
			System.out.println("It's a Palindrome Array");
		else
			System.out.println("It's Not a Plindrome Array");
						
					//or
		
//		boolean flag = palindrome(arr);
//		if(flag==true)
//			System.out.println("It's a Palindrome array");
//		else
//			System.out.println("It's Not a Plindrome Array");
	}
//	private static boolean palindrome(int[] arr) {
//		int i=0 ,j=arr.length-1;
//		while(i<arr.length/2+1) {
//			if(arr[i]!=arr[j])
//				return false;
//			i++;
//			j--;
//		}
//		return true;
//	}
}