package FinalMock;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnEven {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(even(arr)));

	}
	private static int[] even(int[] arr) {
		ArrayList l1=new ArrayList();  
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				l1.add(arr[i]);
			}
		}
		int [] res= new int[l1.size()];
		for (int i = 0; i < res.length; i++) {
			res[i]=(int) l1.get(i);
		}
		return res;
	}
}
