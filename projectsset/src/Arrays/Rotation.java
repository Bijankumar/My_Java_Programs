package Arrays;

import java.util.Arrays;

public class Rotation {
	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5,6,7};
		 int n =arr.length;
		 int[]temp=new int[n];
		 int rotate = 1;
		 int k =0;
		 for (int i = rotate; i < n; i++) {
			temp[k]=arr[i];
			k++;
		}
		 for (int i = 0; i < rotate; i++) {
			 temp[k]=arr[i];
				k++;
		}
			System.out.println(Arrays.toString(temp));
////			for (int i : temp) {
////				System.out.print(i);
////			}
//			 for (int i = 0; i < rotate; i++) {
//				 temp[k]=arr[i];
//					k++;
//			}
//			 for (int i = rotate; i < n; i++) {
//					temp[k]=arr[i];
//					k++;
//				}
//			 System.out.println(Arrays.toString(temp));	
	}
}
