package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class XylemPhl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the value for Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(xylem(arr)));
	}

	private static int[] xylem(int[] arr) {
		ArrayList l1 = new ArrayList();
		ArrayList l2 = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (Check(arr[i]))
				l1.add(arr[i]);
			else
				l2.add(arr[i]);
		}
		int[] xyl = new int[l1.size()];
		int[] phl = new int[l2.size()];
		
		for (int i = 0; i < xyl.length; i++) {
			xyl[i] = (int) l1.get(i);
		}
		for (int i = 0; i < phl.length; i++) {
			phl[i] = (int) l2.get(i);
		}
		if (l1.size() != 0)
			return xyl;
		else
			return phl;
	}

	private static boolean Check(int no) {
		int osum = 0, isum = 0, copy = no;
		while (no != 0) {
			if (copy == no || no < 10)
				osum += no % 10;
			else
				isum += no % 10;

			no /= 10;
		}
		if (osum == isum)
			return true;
		else
			return false;
	}
}
