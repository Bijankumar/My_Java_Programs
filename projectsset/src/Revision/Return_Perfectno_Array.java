package Revision;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Return_Perfectno_Array  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter The Size of Array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the Value for Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}	
		System.out.println(Arrays.toString(Perfect(arr)));
		
	}	
	private static int[] Perfect(int arr[]) {
		ArrayList l1 = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if(check(arr[i]))
				l1.add(arr[i]);
		}
		int []ans = new int[l1.size()];
		int []fas = {-1};
		for (int i = 0; i < ans.length; i++) {
			ans[i]=(int)l1.get(i);
		}
		if(l1.size()==0)
			return fas;
		else 
			return ans;
	}

	private static boolean check(int no) {
		int copy=no,sum=0;
		for (int i = 1; i <= no/2; i++) {
			if(no%i==0) {
				sum=sum+i;
			}
		}
		if(copy==sum)
			return true;
		else
		return false;
	}			
}

