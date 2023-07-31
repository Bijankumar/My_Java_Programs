package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class TestClass {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,5,7,9,15,5,10);
		list.stream().sorted().forEach(s-> {System.out.print(s+" ");});
		list.stream().sorted().forEach(System.out::println);
	}
}
