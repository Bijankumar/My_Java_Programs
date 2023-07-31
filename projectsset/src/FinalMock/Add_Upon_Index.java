package FinalMock;

import java.util.Arrays;

public class Add_Upon_Index {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 9 };
		int index = 2, element = 3, x = 0;
		int res[] = new int[arr.length + 1];
		for (int i = 0; i < res.length; i++) {
			if (i == index) {
				res[i] = element;
			} else {
				res[i] = arr[x];
				x++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}