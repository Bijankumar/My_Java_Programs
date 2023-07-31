package MyPackage;

import java.util.Arrays;

public class For_Clone_Method {
	public static void main(String[] args) {
		int arr[]= {1,2,9};
	int arr2[]=new int[arr.length+3];
	System.out.println(arr2.length);
	arr2=arr.clone();
	System.out.println(arr2.length);
	System.out.println(Arrays.toString(arr2));
	}
	
}
