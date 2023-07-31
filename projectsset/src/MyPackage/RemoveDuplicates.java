package MyPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,4,4,5,6,6};
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (Integer i : arr) {
			numbers.add(i);
		}
		Set<Integer> set = new LinkedHashSet<Integer>();
			set.addAll(numbers);
			numbers.clear();
			numbers.addAll(set);
			System.out.println(numbers);
	}
}
