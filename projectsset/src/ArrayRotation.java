import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int ans[] = new int[arr.length];
		int x=0;
		int rotate = 2;
		for (int i = rotate; i < arr.length; i++) {
			ans[x] = arr[i];
			x++;
		}
		for (int j = 0; j < rotate; j++) {
			ans[x] = arr[j];
			x++;
		}
		System.out.println(Arrays.toString(ans));
	}
}
