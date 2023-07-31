package Arrays;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of Array :");
	int [] arr=new int[sc.nextInt()];
	System.out.println("Enter the Array Elements :");
	for (int i = 0; i < arr.length; i++){
		arr[i]=sc.nextInt();
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1-i; j++) {
			if (arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
	}
}
