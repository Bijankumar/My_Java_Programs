package Arrays;

import java.util.Arrays;

public class ReverseString extends Object{

	public static void main(String[] args) {
		String str ="hello java how are you",name=null,rev,res="";
		String []arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			name =arr[i];
			rev="";
			for (int j = name.length()-1; j >= 0; j--) {
				rev+=name.charAt(j);
			}
			arr[i]=rev;
		}
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			res+=arr[i]+" ";
		}
		System.out.println(res);
	}
}
