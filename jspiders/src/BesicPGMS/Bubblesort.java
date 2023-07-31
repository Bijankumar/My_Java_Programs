package BesicPGMS;

public class Bubblesort {
public static void main(String[] args) {
//	int []arr={10,50,80,50,40,60};
	int[] arr={1,0,1,0,0,1,1,0};
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
